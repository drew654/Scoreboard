package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.ListCalendar
import java.time.Instant
import java.time.format.DateTimeFormatter

data class ListCalendarDto(
    val label: String,
    val value: Int,
    val startDate: String,
    val endDate: String,
    val entries: List<ListCalendarEntryDto>
)

fun ListCalendarDto.toListCalendar(): ListCalendar {
    val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    return ListCalendar(
        label = label,
        value = value,
        startDate = Instant.from(formatter.parse(startDate)),
        endDate = Instant.from(formatter.parse(endDate)),
        entries = entries.map { it.toListCalendarEntry(value) }
    )
}
