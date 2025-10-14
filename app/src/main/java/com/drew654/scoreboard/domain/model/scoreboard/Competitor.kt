package com.drew654.scoreboard.domain.model.scoreboard

data class Competitor(
    val id: Int,
    val homeAway: HomeAway,
    val team: Team,
    val score: Int,
    val records: List<Record>
)
