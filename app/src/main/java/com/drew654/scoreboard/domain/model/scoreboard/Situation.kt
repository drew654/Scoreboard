package com.drew654.scoreboard.domain.model.scoreboard

data class Situation(
    val awayTimeouts: Int,
    val distance: Int,
    val down: Int,
    val downDistanceText: String?,
    val homeTimeouts: Int,
    val isRedZone: Boolean,
    val lastPlay: LastPlay,
    val possessionText: String?,
    val shortDownDistanceText: String?,
    val yardLine: Int
)
