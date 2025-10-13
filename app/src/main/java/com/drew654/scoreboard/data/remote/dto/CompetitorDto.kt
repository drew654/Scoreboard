package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Competitor
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway
import com.drew654.scoreboard.domain.model.scoreboard.HomeAwayTypeAdapter
import com.google.gson.annotations.JsonAdapter

data class CompetitorDto(
    val id: Int,
    @JsonAdapter(HomeAwayTypeAdapter::class)
    val homeAway: HomeAway
)

fun CompetitorDto.toCompetitor(): Competitor {
    return Competitor(
        id = id,
        homeAway = homeAway
    )
}
