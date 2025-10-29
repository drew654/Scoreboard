package com.drew654.scoreboard.presentation.scoreboard

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.domain.model.scoreboard.getDate
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun DateHeader(competition: Competition) {
    val formatter = DateTimeFormatter.ofPattern("EEEE, MMM d", Locale.getDefault())
    val formattedDate = formatter.format(competition.getDate())

    Text(
        text = formattedDate,
        style = MaterialTheme.typography.titleMedium,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}
