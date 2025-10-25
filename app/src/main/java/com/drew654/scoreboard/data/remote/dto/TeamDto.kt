package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Team

data class TeamDto(
    val id: Int,
    val location: String,
    val name: String,
    val abbreviation: String,
    val displayName: String,
    val shortDisplayName: String,
    val logo: String?
)

fun TeamDto.toTeam(): Team {
    return Team(
        id = id,
        location = location,
        name = name,
        abbreviation = abbreviation,
        displayName = displayName,
        shortDisplayName = shortDisplayName,
        logo = logo
    )
}
