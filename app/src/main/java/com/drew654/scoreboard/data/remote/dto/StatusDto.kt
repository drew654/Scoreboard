package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Status

data class StatusDto(
    val clock: Int,
    val displayClock: String,
    val period: Int,
    val type: StatusTypeDto
)

fun StatusDto.toStatus(): Status {
    return Status(
        clock = clock,
        displayClock = displayClock,
        period = period,
        type = type.toStatusType()
    )
}
