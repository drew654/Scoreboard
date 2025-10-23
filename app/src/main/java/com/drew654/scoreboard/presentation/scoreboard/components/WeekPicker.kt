package com.drew654.scoreboard.presentation.scoreboard.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.animateScrollBy
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.drew654.scoreboard.domain.model.scoreboard.ListCalendarEntry
import kotlinx.coroutines.launch

@Composable
fun WeekPicker(
    entries: List<ListCalendarEntry>,
    selectedEntryIndex: Int,
    onEntrySelected: (Int) -> Unit,
    isVisible: Boolean,
    onInitialScrollComplete: () -> Unit
) {
    val lazyListState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(selectedEntryIndex) {
        if (selectedEntryIndex in entries.indices) {
            coroutineScope.launch {
                val itemInfo = lazyListState.layoutInfo.visibleItemsInfo
                    .firstOrNull { it.index == selectedEntryIndex }

                if (itemInfo != null) {
                    val center = lazyListState.layoutInfo.viewportEndOffset / 2
                    val itemCenter = itemInfo.offset + itemInfo.size / 2
                    lazyListState.animateScrollBy((itemCenter - center).toFloat())
                } else {
                    lazyListState.animateScrollToItem(selectedEntryIndex)
                    val itemInfo = lazyListState.layoutInfo.visibleItemsInfo.firstOrNull {it.index == selectedEntryIndex}
                    val center = lazyListState.layoutInfo.viewportEndOffset / 2
                    val itemCenter = itemInfo?.offset?.plus(itemInfo.size / 2)
                    lazyListState.scrollBy((itemCenter?.minus(center))?.toFloat() ?: 0f)
                }
                onInitialScrollComplete()
            }
        }
    }

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .alpha(if (isVisible) 1f else 0f),
        state = lazyListState,
        userScrollEnabled = isVisible
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
