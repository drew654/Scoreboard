package com.drew654.scoreboard.domain.model.scoreboard

data class League(
    val id: Int,
    val name: String,
    val abbreviation: String,
    val midsizeName: String,
    val slug: String,
    val calendar: List<ListCalendar>
)
