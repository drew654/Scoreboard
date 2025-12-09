package com.drew654.summary.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.End

data class EndDto(
    val yardLine: Int
)

fun EndDto.toEnd(): End {
    return End(
        yardLine = yardLine
    )
}
