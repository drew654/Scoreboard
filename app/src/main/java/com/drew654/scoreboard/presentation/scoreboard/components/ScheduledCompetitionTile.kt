package com.drew654.scoreboard.presentation.scoreboard.components

import android.text.format.DateFormat.is24HourFormat
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.domain.model.scoreboard.Competitor
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway
import com.drew654.scoreboard.domain.model.scoreboard.RecordType
import com.drew654.scoreboard.presentation.formatTime

@Composable
fun ScheduledCompetitionTile(competition: Competition) {
    val context = LocalContext.current
    val homeTeam = competition.competitors.find { it.homeAway == HomeAway.HOME }
    val awayTeam = competition.competitors.find { it.homeAway == HomeAway.AWAY }
    val isTBD = competition.status.type.shortDetail == "TBD"

    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
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
            Text(
                text = if (isTBD) "TBD" else formatTime(competition.date, is24HourFormat(context)),
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .weight(1.5f)
                    .padding(start = 12.dp)
            )
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
            text = team.records.find { it.type == RecordType.OVERALL }?.summary
                ?: "",
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.titleMedium
        )
    }
}
