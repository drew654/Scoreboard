package com.drew654.scoreboard.domain.model.scoreboard

data class Team(
    val id: Int,
    val location: String,
    val name: String,
    val abbreviation: String,
    val displayName: String,
    val shortDisplayName: String,
    val logo: String
)
