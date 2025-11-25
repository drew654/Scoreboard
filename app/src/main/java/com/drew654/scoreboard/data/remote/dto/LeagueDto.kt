package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.League
import java.time.Instant
import java.time.format.DateTimeFormatter

data class LeagueDto(
    val id: Int,
    val name: String,
    val abbreviation: String,
    val midsizeName: String,
    val slug: String,
    val calendarStartDate: String,
    val calendarEndDate: String,
    val calendar: List<ListCalendarDto>
)

fun LeagueDto.toLeague(): League {
    val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    return League(
        id = id,
        name = name,
        abbreviation = abbreviation,
        midsizeName = midsizeName,
        slug = slug,
        calendarStartDate = Instant.from(formatter.parse(calendarStartDate)),
        calendarEndDate = Instant.from(formatter.parse(calendarEndDate)),
        calendar = calendar.map { it.toListCalendar() }
    )
}
