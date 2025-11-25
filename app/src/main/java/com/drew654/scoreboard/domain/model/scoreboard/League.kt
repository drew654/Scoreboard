package com.drew654.scoreboard.domain.model.scoreboard

import java.time.Instant

data class League(
    val id: Int,
    val name: String,
    val abbreviation: String,
    val midsizeName: String,
    val slug: String,
    val calendarStartDate: Instant,
    val calendarEndDate: Instant,
    val calendar: List<ListCalendar>
)
