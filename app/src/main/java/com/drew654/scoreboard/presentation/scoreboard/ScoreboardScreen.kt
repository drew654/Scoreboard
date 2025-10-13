package com.drew654.scoreboard.presentation.scoreboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.presentation.scoreboard.components.CompetitionTile

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
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        state.scoreboard?.let {
            Column {
                LazyColumn {
                    items(allCompetitions) { competition ->
                        CompetitionTile(competition = competition)
                    }
                }
            }
        }
    }
}
