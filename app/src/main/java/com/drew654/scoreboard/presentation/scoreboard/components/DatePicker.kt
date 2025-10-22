package com.drew654.scoreboard.presentation.scoreboard.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.drew654.scoreboard.domain.model.scoreboard.ListCalendarEntry

@Composable
fun DatePicker(entries: List<ListCalendarEntry>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        items(entries) { entry ->
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surface
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(8.dp)
                ) {
                    Text(text = entry.label, style = MaterialTheme.typography.titleMedium)
                    Text(text = entry.detail, style = MaterialTheme.typography.bodyMedium)
                }
            }
        }
    }
}
