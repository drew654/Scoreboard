package com.drew654.scoreboard.domain.model.scoreboard

data class Status(
    val clock: Int,
    val displayClock: String,
    val period: Int,
    val type: StatusType
)
