package com.drew654.scoreboard.domain.model.scoreboard

import java.time.Instant

data class ListCalendarEntry(
    val label: String,
    val alternateLabel: String,
    val detail: String,
    val value: Int,
    val startDate: Instant,
    val endDate: Instant
)
