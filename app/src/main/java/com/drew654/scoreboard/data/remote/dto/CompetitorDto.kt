package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Competitor
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway
import com.drew654.scoreboard.domain.model.scoreboard.HomeAwayTypeAdapter
import com.google.gson.annotations.JsonAdapter

data class CompetitorDto(
    val id: Int,
    @JsonAdapter(HomeAwayTypeAdapter::class)
    val homeAway: HomeAway,
    val team: TeamDto,
    val score: Int,
    val linescores: List<LinescoreDto>?,
    val records: List<RecordDto>?
)

fun CompetitorDto.toCompetitor(): Competitor {
    return Competitor(
        id = id,
        homeAway = homeAway,
        team = team.toTeam(),
        score = score,
        linescores = linescores.orEmpty().map { it.toLinescore() },
        records = records.orEmpty().map { it.toRecord() }
    )
}
