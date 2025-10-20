package com.drew654.scoreboard.domain.model.scoreboard

data class Scoreboard(
    val leagues: List<League>,
    val season: Season,
    val events: List<Event>
)
