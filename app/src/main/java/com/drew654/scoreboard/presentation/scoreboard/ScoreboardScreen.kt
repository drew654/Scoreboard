package com.drew654.scoreboard.presentation.scoreboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.pulltorefresh.PullToRefreshContainer
import androidx.compose.material3.pulltorefresh.rememberPullToRefreshState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.domain.model.scoreboard.getDate
import com.drew654.scoreboard.presentation.Screen
import com.drew654.scoreboard.presentation.scoreboard.components.InProgressCompetitionTile
import com.drew654.scoreboard.presentation.scoreboard.components.ScheduledCompetitionTile
import com.drew654.scoreboard.presentation.scoreboard.components.WeekPicker

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScoreboardScreen(
    viewModel: ScoreboardViewModel,
    navController: NavController
) {
    val state = viewModel.state.value
    val competitions = viewModel.state.value.competitions
    val calendarEntries = viewModel.state.value.calendarEntries
    val selectedEntry = viewModel.selectedCalendarEntry.collectAsState()
    val isWeekPickerVisible = remember { mutableStateOf(false) }
    val pullToRefreshState = rememberPullToRefreshState()

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
        state.scoreboard?.let {
            Column {
                WeekPicker(
                    entries = calendarEntries,
                    selectedEntryIndex = calendarEntries.indexOf(selectedEntry.value),
                    onEntrySelected = {
                        viewModel.setSelectedCalendarEntry(calendarEntries[it])
                    },
                    isVisible = isWeekPickerVisible.value,
                    onInitialScrollComplete = {
                        isWeekPickerVisible.value = true
                    }
                )
                if (isWeekPickerVisible.value) {
                    Spacer(modifier = Modifier.height(8.dp))
                    LazyColumn(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        itemsIndexed(competitions) { index, competition ->
                            if (shouldShowDateHeader(competitions, index)) {
                                DateHeader(competition)
                            }
                            when (competition.status.type.name) {
                                "STATUS_SCHEDULED" -> {
                                    ScheduledCompetitionTile(competition = competition)
                                }

                                "STATUS_IN_PROGRESS",
                                "STATUS_END_PERIOD",
                                "STATUS_HALFTIME" -> {
                                    InProgressCompetitionTile(
                                        competition = competition,
                                        onClick = {
                                            navController.navigate("${Screen.Competition.route}/${competition.id}")
                                        }
                                    )
                                }

                                "STATUS_FINAL" -> {
                                    InProgressCompetitionTile(
                                        competition = competition
                                    )
                                }
                            }
                        }
                        items(1) {
                            Spacer(modifier = Modifier.height(8.dp))
                        }
                    }
                }
            }
        }
        PullToRefreshContainer(
            state = pullToRefreshState,
            containerColor = MaterialTheme.colorScheme.surface,
            modifier = Modifier.align(Alignment.TopCenter)
        )
    }
}

private fun shouldShowDateHeader(competitions: List<Competition>, index: Int): Boolean {
    if (index == 0) {
        return true
    }

    val currentCompetition = competitions[index]
    val previousCompetition = competitions[index - 1]
    return currentCompetition.getDate() != previousCompetition.getDate()
}
