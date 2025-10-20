package com.drew654.scoreboard.presentation.scoreboard

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Locale

@Composable
fun DateHeader(instant: Instant) {
    val formatter = DateTimeFormatter.ofPattern("EEEE, MMM d", Locale.getDefault())
    val localDate = instant.atZone(ZoneId.systemDefault())
    val formattedDate = formatter.format(localDate)

    Text(
        text = formattedDate,
        style = MaterialTheme.typography.titleMedium,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}
