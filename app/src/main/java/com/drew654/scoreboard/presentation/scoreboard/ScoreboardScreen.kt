package com.drew654.scoreboard.presentation.scoreboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.presentation.scoreboard.components.CompetitionTile
import com.drew654.scoreboard.presentation.scoreboard.components.WeekPicker
import java.time.ZoneId

@Composable
fun ScoreboardScreen(
    viewModel: ScoreboardViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    val competitions = viewModel.state.value.competitions
    val calendarEntries = viewModel.state.value.calendarEntries
    val selectedEntry = viewModel.selectedCalendarEntry.collectAsState()
    var isWeekPickerVisible = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier.fillMaxSize(),
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
                    LazyColumn {
                        itemsIndexed(competitions) { index, competition ->
                            if (shouldShowDateHeader(competitions, index)) {
                                DateHeader(competition.date)
                            }
                            CompetitionTile(competition = competition)
                        }
                    }
                }
            }
        }
    }
}

private fun shouldShowDateHeader(competitions: List<Competition>, index: Int): Boolean {
    if (index == 0) {
        return true
    }

    val currentInstant = competitions[index].date
    val previousInstant = competitions[index - 1].date
    val zoneId = ZoneId.systemDefault()
    val currentDate = currentInstant.atZone(zoneId).toLocalDate()
    val previousDate = previousInstant.atZone(zoneId).toLocalDate()

    return currentDate != previousDate
}
