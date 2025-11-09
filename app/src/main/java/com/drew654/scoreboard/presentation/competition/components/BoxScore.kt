package com.drew654.scoreboard.presentation.competition.components

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.drew.scoreboard.presentation.preview.PreviewData
import com.drew654.scoreboard.domain.model.scoreboard.Competitor
import com.drew654.scoreboard.presentation.ui.theme.ScoreboardTheme

@Composable
fun BoxScore(
    homeTeam: Competitor,
    awayTeam: Competitor
) {
    Card(
        modifier = Modifier
            .padding(16.dp),
        shape = CardDefaults.shape,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(Modifier.weight(1f))
                Row(
                    modifier = Modifier.weight(2f),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    listOf("1", "2", "3", "4", "T").forEach { linescore ->
                        Text(
                            text = linescore,
                            modifier = Modifier.width(32.dp),
                            fontWeight = if (linescore == "T") FontWeight.Bold else null,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
            HorizontalDivider(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            )
            TeamRow(team = homeTeam)
            Spacer(Modifier.height(8.dp))
            TeamRow(team = awayTeam)
        }
    }
}

@Composable
fun TeamRow(team: Competitor) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = team.team.logo,
                contentDescription = team.team.displayName,
                modifier = Modifier.size(16.dp)
            )
            Text(
                text = team.team.shortDisplayName,
                modifier = Modifier
                    .padding(start = 4.dp)
            )
        }
        Row(
            modifier = Modifier.weight(2f),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            listOf(1, 2, 3, 4).forEach { index ->
                val linescore = team.linescores?.getOrNull(index - 1)
                Text(
                    text = linescore?.displayValue ?: "",
                    modifier = Modifier.width(32.dp),
                    textAlign = TextAlign.Center
                )
            }
            Text(
                text = team.score.toString(),
                modifier = Modifier.width(32.dp),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview(
    name = "Light Mode",
    showBackground = true
)
@Preview(
    name = "Dark Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Composable
private fun BoxScorePreview1() {
    ScoreboardTheme {
        Surface {
            BoxScore(
                homeTeam = PreviewData.sampleFinalCompetition.competitors[0],
                awayTeam = PreviewData.sampleFinalCompetition.competitors[1]
            )
        }
    }
}

@Preview(
    name = "Light Mode",
    showBackground = true
)
@Preview(
    name = "Dark Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true
)
@Composable
private fun BoxScorePreview2() {
    ScoreboardTheme {
        Surface {
            BoxScore(
                homeTeam = PreviewData.sampleEndPeriodCompetition.competitors[0],
                awayTeam = PreviewData.sampleEndPeriodCompetition.competitors[1]
            )
        }
    }
}
