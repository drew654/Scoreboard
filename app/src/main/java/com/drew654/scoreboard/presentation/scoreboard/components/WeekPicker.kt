package com.drew654.scoreboard.presentation.scoreboard.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.drew654.scoreboard.domain.model.scoreboard.ListCalendarEntry

@Composable
fun WeekPicker(
    entries: List<ListCalendarEntry>,
    selectedEntryIndex: Int,
    onEntrySelected: (Int) -> Unit
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        itemsIndexed(entries) { index, entry ->
            Card(
                shape = CardDefaults.shape,
                colors = CardDefaults.cardColors(
                    containerColor = if (index == selectedEntryIndex) MaterialTheme.colorScheme.primaryContainer
                    else MaterialTheme.colorScheme.surface
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(4.dp)
                    .clip(CardDefaults.shape)
                    .clickable {
                        onEntrySelected(index)
                    }
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
