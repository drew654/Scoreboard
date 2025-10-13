package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Event

data class EventDto(
    val id: Int,
    val name: String,
    val shortName: String,
    val competitions: List<CompetitionDto>
)

fun EventDto.toEvent(): Event {
    return Event(
        id = id,
        name = name,
        shortName = shortName,
        competitions = competitions.map { it.toCompetition() }
    )
}
