package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.ListCalendarEntry
import java.time.Instant
import java.time.format.DateTimeFormatter

data class ListCalendarEntryDto(
    val label: String,
    val alternateLabel: String,
    val detail: String,
    val value: Int,
    val startDate: String,
    val endDate: String
)

fun ListCalendarEntryDto.toListCalendarEntry(): ListCalendarEntry {
    val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    return ListCalendarEntry(
        label = label,
        alternateLabel = alternateLabel,
        detail = detail,
        value = value,
        startDate = Instant.from(formatter.parse(startDate)),
        endDate = Instant.from(formatter.parse(endDate))
    )
}
