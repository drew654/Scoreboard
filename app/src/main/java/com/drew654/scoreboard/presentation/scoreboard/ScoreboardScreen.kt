package com.drew654.scoreboard.presentation.scoreboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
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
    val allCompetitions: List<Competition> = state.scoreboard?.events?.flatMap { event ->
        event.competitions.map { competition ->
            competition
        }
    } ?: emptyList()
    val entries =
        state.scoreboard?.leagues?.find { it.id == 23 }?.calendar?.find { it.value == 2 }?.entries
            ?: emptyList()
    val selectedEntryIndex = remember { mutableIntStateOf(0) }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        state.scoreboard?.let {
            Column {
                WeekPicker(
                    entries = entries,
                    selectedEntryIndex = selectedEntryIndex.intValue,
                    onEntrySelected = {
                        selectedEntryIndex.intValue = it
                    }
                )
                LazyColumn {
                    itemsIndexed(allCompetitions) { index, competition ->
                        if (shouldShowDateHeader(allCompetitions, index)) {
                            DateHeader(competition.date)
                        }
                        CompetitionTile(competition = competition)
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
