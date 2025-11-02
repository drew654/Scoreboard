package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Linescore

data class LinescoreDto(
    val value: Int,
    val displayValue: String,
    val period: Int
)

fun LinescoreDto.toLinescore(): Linescore {
    return Linescore(
        value = value,
        displayValue = displayValue,
        period = period
    )
}
