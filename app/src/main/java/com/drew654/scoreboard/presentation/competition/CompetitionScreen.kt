package com.drew654.scoreboard.presentation.competition

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway
import com.drew654.scoreboard.presentation.competition.components.BoxScore
import com.drew654.scoreboard.presentation.scoreboard.ScoreboardViewModel

@Composable
fun CompetitionScreen(
    viewModel: ScoreboardViewModel,
    competitionId: String
) {
    val state = viewModel.state.value
    val competition = state.competitions.find { it.id == competitionId.toInt() }!!
    val homeTeam = competition.competitors.find { it.homeAway == HomeAway.HOME }!!
    val awayTeam = competition.competitors.find { it.homeAway == HomeAway.AWAY }!!

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            BoxScore(homeTeam = homeTeam, awayTeam = awayTeam)
        }
    }
}
