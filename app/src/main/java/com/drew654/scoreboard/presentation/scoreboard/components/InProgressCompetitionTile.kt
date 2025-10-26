package com.drew654.scoreboard.presentation.scoreboard.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.domain.model.scoreboard.Competitor
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway

@Composable
fun InProgressCompetitionTile(competition: Competition, onClick: (() -> Unit)? = null) {
    val homeTeam = competition.competitors.find { it.homeAway == HomeAway.HOME }
    val awayTeam = competition.competitors.find { it.homeAway == HomeAway.AWAY }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .then(
                if (onClick == null) {
                    Modifier
                } else {
                    Modifier
                        .clip(CardDefaults.shape)
                        .clickable(onClick = onClick)
                }
            ),
        shape = CardDefaults.shape,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.weight(3f)
            ) {
                awayTeam?.let { TeamRow(team = it) }
                homeTeam?.let { TeamRow(team = it) }
            }
            Column(
                modifier = Modifier
                    .weight(1.5f)
                    .padding(start = 12.dp)
            ) {
                Text(
                    text = competition.status.type.shortDetail,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
        }
    }
}

@Composable
private fun TeamRow(team: Competitor) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = team.team.logo,
            contentDescription = "${team.team.logo} logo",
            modifier = Modifier
                .size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = team.team.shortDisplayName,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onSurface,
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = team.score.toString(),
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}
