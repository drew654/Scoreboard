package com.drew654.summary.data.remote.dto

import com.drew654.summary.domain.model.summary.CurrentDrive

data class CurrentDriveDto(
    val description: String,
    val id: String,
    val isScore: Boolean,
    val offensivePlays: Int,
    val plays: List<PlayDto>
)

fun CurrentDriveDto.toCurrentDrive(): CurrentDrive {
    return CurrentDrive(
        description = description,
        id = id,
        isScore = isScore,
        offensivePlays = offensivePlays,
        plays = plays.map { it -> it.toPlay() }
    )
}
