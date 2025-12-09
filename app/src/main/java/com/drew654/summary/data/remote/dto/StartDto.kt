package com.drew654.summary.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Start

data class StartDto(
    val yardLine: Int
)

fun StartDto.toStart(): Start {
    return Start(
        yardLine = yardLine
    )
}
