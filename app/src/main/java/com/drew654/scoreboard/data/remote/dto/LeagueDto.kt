package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.League

data class LeagueDto(
    val id: Int,
    val name: String,
    val abbreviation: String,
    val midsizeName: String,
    val slug: String,
    val calendar: List<ListCalendarDto>
)

fun LeagueDto.toLeague(): League {
    return League(
        id = id,
        name = name,
        abbreviation = abbreviation,
        midsizeName = midsizeName,
        slug = slug,
        calendar = calendar.map { it.toListCalendar() }
    )
}
