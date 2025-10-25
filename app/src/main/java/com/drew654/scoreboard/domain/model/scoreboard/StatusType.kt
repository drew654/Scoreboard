package com.drew654.scoreboard.domain.model.scoreboard

data class StatusType(
    val id: Int,
    val name: String,
    val state: String,
    val completed: Boolean,
    val description: String,
    val detail: String,
    val shortDetail: String
)
