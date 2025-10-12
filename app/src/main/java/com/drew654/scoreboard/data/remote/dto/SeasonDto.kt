package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Season

data class SeasonDto(
    val type: Int,
    val year: Int
)

fun SeasonDto.toSeason(): Season {
    return Season(
        type = type,
        year = year
    )
}
