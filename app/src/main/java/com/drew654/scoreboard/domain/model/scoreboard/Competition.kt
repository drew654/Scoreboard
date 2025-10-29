package com.drew654.scoreboard.domain.model.scoreboard

import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.temporal.ChronoUnit

data class Competition(
    val id: Int,
    val competitors: List<Competitor>,
    val date: Instant,
    val status: Status
)

fun Competition.isTbd(): Boolean {
    return this.status.type.shortDetail == "TBD"
}

fun Competition.getDate(): LocalDate {
    return if (this.isTbd()) this.date.truncatedTo(ChronoUnit.DAYS).atZone(ZoneId.of("UTC"))
        .toLocalDate()
    else this.date.atZone(ZoneId.systemDefault()).toLocalDate()
}
