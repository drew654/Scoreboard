package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.summary.data.remote.dto.SituationDto
import com.drew654.summary.data.remote.dto.toSituation
import java.time.Instant
import java.time.format.DateTimeFormatter

data class CompetitionDto(
    val id: Int,
    val competitors: List<CompetitorDto>,
    val date: String,
    val situation: SituationDto?,
    val status: StatusDto
)

fun CompetitionDto.toCompetition(): Competition {
    val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    return Competition(
        id = id,
        competitors = competitors.map { it.toCompetitor() },
        date = Instant.from(formatter.parse(date)),
        situation = situation?.toSituation(),
        status = status.toStatus()
    )
}
