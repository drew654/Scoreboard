package com.drew654.summary.data.remote.dto

import com.drew654.summary.domain.model.summary.Drive

data class DriveDto(
    val description: String,
    val displayResult: String,
    val id: String,
    val isScore: Boolean,
    val offensivePlays: Int,
    val plays: List<PlayDto>,
    val result: String,
    val shortDisplayResult: String,
    val yards: Int
)

fun DriveDto.toDrive(): Drive {
    return Drive(
        description = description,
        displayResult = displayResult,
        id = id,
        isScore = isScore,
        offensivePlays = offensivePlays,
        plays = plays.map { it -> it.toPlay() },
        result = result,
        shortDisplayResult = shortDisplayResult,
        yards = yards
    )
}
