package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Competition

data class CompetitionDto(
    val id: Int,
    val competitors: List<CompetitorDto>
)

fun CompetitionDto.toCompetition(): Competition {
    return Competition(
        id = id,
        competitors = competitors.map { it.toCompetitor() }
    )
}
