package com.drew654.scoreboard.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.StatusType

data class StatusTypeDto(
    val id: Int,
    val name: String,
    val state: String,
    val completed: Boolean,
    val description: String,
    val detail: String,
    val shortDetail: String
)

fun StatusTypeDto.toStatusType(): StatusType {
    return StatusType(
        id = id,
        name = name,
        state = state,
        completed = completed,
        description = description,
        detail = detail,
        shortDetail = shortDetail
    )
}
