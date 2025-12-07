package com.drew654.scoreboard.presentation.competition

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway
import com.drew654.scoreboard.presentation.competition.components.BoxScore
import com.drew654.scoreboard.presentation.competition.components.Header
import com.drew654.scoreboard.presentation.scoreboard.ScoreboardViewModel
import com.drew654.summary.presentation.summary.SummaryViewModel

@Composable
fun CompetitionScreen(
    viewModel: ScoreboardViewModel,
    summaryViewModel: SummaryViewModel,
    competitionId: String
) {
    val state = viewModel.state.value
    val competition = state.competitions.find { it.id == competitionId.toInt() }!!
    val homeTeam = competition.competitors.find { it.homeAway == HomeAway.HOME }!!
    val awayTeam = competition.competitors.find { it.homeAway == HomeAway.AWAY }!!
    val shortDetail = competition.status.type.shortDetail
    val currentDrive = summaryViewModel.state.value.summary?.drives?.current
    val shortDownDistanceText = currentDrive?.plays?.last()?.end?.shortDownDistanceText
    val possessionText = currentDrive?.plays?.last()?.end?.possessionText

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
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
}
