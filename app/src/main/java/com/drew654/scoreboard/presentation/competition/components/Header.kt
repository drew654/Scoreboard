package com.drew654.scoreboard.presentation.competition.components

import android.content.res.Configuration
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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.drew654.scoreboard.data.remote.dto.toCompetition
import com.drew654.scoreboard.data.remote.dto.toCompetitor
import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.domain.model.scoreboard.Competitor
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway
import com.drew654.scoreboard.presentation.preview.MockData.sampleScoreboard
import com.drew654.scoreboard.presentation.ui.theme.ScoreboardTheme

@Composable
fun Header(
    competition: Competition,
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = homeTeam.team.logo,
                contentDescription = "${homeTeam.team.logo} logo",
                modifier = Modifier
                    .size(48.dp)
            )
            Spacer(Modifier.width(24.dp))
            Text(
                text = homeTeam.score.toString(),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.weight(1f))
            Column {
                Text(
                    text = competition.status.type.shortDetail
                )
            }
            Spacer(Modifier.weight(1f))
            Text(
                text = awayTeam.score.toString(),
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(Modifier.width(24.dp))
            AsyncImage(
                model = awayTeam.team.logo,
                contentDescription = "${awayTeam.team.logo} logo",
                modifier = Modifier
                    .size(48.dp)
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
private fun HeaderPreview() {
    ScoreboardTheme {
        Surface {
            val competition =
                sampleScoreboard.events.find { it.id == 401752763 }!!.competitions.find { it.id == 401752763 }
            val homeTeam = competition?.competitors?.find { it.homeAway == HomeAway.HOME }!!
            val awayTeam = competition.competitors.find { it.homeAway == HomeAway.AWAY }!!
            Header(
                competition = competition.toCompetition(),
                awayTeam = awayTeam.toCompetitor(),
                homeTeam = homeTeam.toCompetitor()
            )
        }
    }
}
