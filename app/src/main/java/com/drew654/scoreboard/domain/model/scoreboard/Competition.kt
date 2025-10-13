package com.drew654.scoreboard.domain.model.scoreboard

data class Competition(
    val id: Int,
    val competitors: List<Competitor>
)
