package com.drew654.summary.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.LastPlay

data class LastPlayDto(
    val end: EndDto,
    val id: String,
    val start: StartDto
)

fun LastPlayDto.toLastPlay(): LastPlay {
    return LastPlay(
        end = end.toEnd(),
        id = id,
        start = start.toStart()
    )
}
