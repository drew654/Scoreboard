package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Competition
import java.time.Instant
import java.time.format.DateTimeFormatter

data class CompetitionDto(
    val id: Int,
    val competitors: List<CompetitorDto>,
    val date: String
)

fun CompetitionDto.toCompetition(): Competition {
    val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    return Competition(
        id = id,
        competitors = competitors.map { it.toCompetitor() },
        date = Instant.from(formatter.parse(date))
    )
}
