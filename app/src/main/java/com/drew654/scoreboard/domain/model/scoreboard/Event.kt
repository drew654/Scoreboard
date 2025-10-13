package com.drew654.scoreboard.domain.model.scoreboard

data class Event(
    val id: Int,
    val name: String,
    val shortName: String,
    val competitions: List<Competition>
)
