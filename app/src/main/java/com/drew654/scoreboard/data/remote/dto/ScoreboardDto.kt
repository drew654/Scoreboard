package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Scoreboard
import com.drew654.scoreboard.domain.model.scoreboard.Season

data class ScoreboardDto(
    val season: Season
)

fun ScoreboardDto.toScoreboard(): Scoreboard {
    return Scoreboard(
        season = season
    )
}
