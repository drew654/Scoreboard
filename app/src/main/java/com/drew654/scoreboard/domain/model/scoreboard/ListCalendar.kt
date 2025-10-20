package com.drew654.scoreboard.domain.model.scoreboard

import java.time.Instant

data class ListCalendar(
    val label: String,
    val value: Int,
    val startDate: Instant,
    val endDate: Instant,
    val entries: List<ListCalendarEntry>
)
