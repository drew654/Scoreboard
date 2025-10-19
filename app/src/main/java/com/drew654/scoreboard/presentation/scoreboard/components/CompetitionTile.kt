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
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway
import com.drew654.scoreboard.domain.model.scoreboard.RecordType
import com.drew654.scoreboard.presentation.formatHour

@Composable
fun CompetitionTile(competition: Competition) {
    val context = LocalContext.current
    val homeTeam = competition.competitors.find { it.homeAway == HomeAway.HOME }
    val awayTeam = competition.competitors.find { it.homeAway == HomeAway.AWAY }

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
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ) {
            Column(
                modifier = Modifier.weight(3f)
            ) {
                awayTeam?.let {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AsyncImage(
                            model = awayTeam.team.logo,
                            contentDescription = "${awayTeam.team.logo} logo",
                            modifier = Modifier
                                .size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = awayTeam.team.shortDisplayName,
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurface,
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = awayTeam.records.find { it.type == RecordType.OVERALL }?.summary
                                ?: "",
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
                homeTeam?.let {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AsyncImage(
                            model = homeTeam.team.logo,
                            contentDescription = "${homeTeam.team.logo} logo",
                            modifier = Modifier
                                .size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = homeTeam.team.shortDisplayName,
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = homeTeam.records.find { it.type == RecordType.OVERALL }?.summary
                                ?: "",
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
            }
            Text(
                text = formatHour(competition.date, is24HourFormat(context)),
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 12.dp)
            )
        }
    }
}
