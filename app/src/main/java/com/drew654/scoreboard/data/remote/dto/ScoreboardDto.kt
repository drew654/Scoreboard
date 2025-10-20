package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Scoreboard
import com.drew654.scoreboard.domain.model.scoreboard.Season

data class ScoreboardDto(
    val leagues: List<LeagueDto>,
    val season: Season,
    val events: List<EventDto>
)

fun ScoreboardDto.toScoreboard(): Scoreboard {
    return Scoreboard(
        leagues = leagues.map { it.toLeague() },
        season = season,
        events = events.map { it.toEvent() }
    )
}
