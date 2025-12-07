package com.drew654.scoreboard.presentation.competition

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.pulltorefresh.PullToRefreshContainer
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway
import com.drew654.scoreboard.presentation.competition.components.BoxScore
import com.drew654.scoreboard.presentation.competition.components.Header
import com.drew654.scoreboard.presentation.scoreboard.ScoreboardViewModel
import com.drew654.summary.presentation.summary.SummaryViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CompetitionScreen(
    viewModel: ScoreboardViewModel,
    summaryViewModel: SummaryViewModel,
    competitionId: String
) {
    val pullToRefreshState = rememberPullToRefreshState()
    val state = viewModel.state.value
    val competition = state.competitions.find { it.id == competitionId.toInt() }!!
    val homeTeam = competition.competitors.find { it.homeAway == HomeAway.HOME }!!
    val awayTeam = competition.competitors.find { it.homeAway == HomeAway.AWAY }!!
    val shortDetail = competition.status.type.shortDetail
    val currentDrive = summaryViewModel.state.value.summary?.drives?.current
    val shortDownDistanceText =
        if (competition.status.type.name == "STATUS_HALFTIME") null else currentDrive?.plays?.last()?.end?.shortDownDistanceText
    val possessionText =
        if (competition.status.type.name == "STATUS_HALFTIME") null else currentDrive?.plays?.last()?.end?.possessionText

    if (pullToRefreshState.isRefreshing) {
        LaunchedEffect(true) {
            viewModel.refresh()
        }
    }

    LaunchedEffect(state.isLoading) {
        if (!state.isLoading) {
            pullToRefreshState.endRefresh()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(pullToRefreshState.nestedScrollConnection),
        contentAlignment = Alignment.TopCenter
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
        ) {
            items(1) {
                Header(
                    homeTeam = homeTeam,
                    awayTeam = awayTeam,
                    shortDetail = shortDetail,
                    shortDownDistanceText = shortDownDistanceText,
                    possessionText = possessionText
                )
                BoxScore(homeTeam = homeTeam, awayTeam = awayTeam)
            }
        }
        PullToRefreshContainer(
            state = pullToRefreshState,
            containerColor = MaterialTheme.colorScheme.surface,
            modifier = Modifier.align(Alignment.TopCenter)
        )
    }
}
