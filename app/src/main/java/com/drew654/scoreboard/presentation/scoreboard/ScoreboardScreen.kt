package com.drew654.scoreboard.presentation.scoreboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.presentation.Screen
import com.drew654.scoreboard.presentation.scoreboard.components.InProgressCompetitionTile
import com.drew654.scoreboard.presentation.scoreboard.components.ScheduledCompetitionTile
import com.drew654.scoreboard.presentation.scoreboard.components.WeekPicker
import java.time.ZoneId
import java.time.temporal.ChronoUnit

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScoreboardScreen(
    viewModel: ScoreboardViewModel = hiltViewModel(),
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
                    LazyColumn(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        itemsIndexed(competitions) { index, competition ->
                            if (shouldShowDateHeader(competitions, index)) {
                                DateHeader(competition.date)
                            }
                            when (competition.status.type.name) {
                                "STATUS_SCHEDULED" -> {
                                    ScheduledCompetitionTile(competition = competition)
                                }

                                "STATUS_IN_PROGRESS" -> {
                                    InProgressCompetitionTile(
                                        competition = competition,
                                        onClick = {
                                            navController.navigate(Screen.Competition.route)
                                        }
                                    )
                                }

                                "STATUS_END_PERIOD",
                                "STATUS_HALFTIME",
                                "STATUS_FINAL" -> {
                                    InProgressCompetitionTile(
                                        competition = competition
                                    )
                                }
                            }
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
    val zoneId = ZoneId.systemDefault()
    val currentDate = if (currentCompetition.status.type.shortDetail == "TBD") {
        currentCompetition.date.truncatedTo(ChronoUnit.DAYS).atZone(ZoneId.of("UTC")).toLocalDate()
    } else {
        currentCompetition.date.atZone(zoneId).toLocalDate()
    }
    val previousDate = if (previousCompetition.status.type.shortDetail == "TBD") {
        previousCompetition.date.truncatedTo(ChronoUnit.DAYS).atZone(ZoneId.of("UTC")).toLocalDate()
    } else {
        previousCompetition.date.atZone(zoneId).toLocalDate()
    }

    return currentDate != previousDate
}
