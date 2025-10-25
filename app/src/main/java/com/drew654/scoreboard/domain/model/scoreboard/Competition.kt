package com.drew654.scoreboard.domain.model.scoreboard

import java.time.Instant

data class Competition(
    val id: Int,
    val competitors: List<Competitor>,
    val date: Instant,
    val status: Status
)
