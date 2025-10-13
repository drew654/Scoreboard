package com.drew654.scoreboard.presentation.scoreboard.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway

@Composable
fun CompetitionTile(competition: Competition) {
    val homeTeam = competition.competitors.find { it.homeAway == HomeAway.HOME }
    val awayTeam = competition.competitors.find { it.homeAway == HomeAway.AWAY }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, MaterialTheme.colorScheme.onBackground, MaterialTheme.shapes.medium)
            .padding(4.dp)
    ) {
        homeTeam?.let {
            awayTeam?.let {
                Column {
                    Text(
                        text = awayTeam.team.shortDisplayName
                    )
                    Text(
                        text = homeTeam.team.shortDisplayName
                    )
                }
            }
        }
    }
}
