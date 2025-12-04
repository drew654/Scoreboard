package com.drew654.summary.data.remote.dto

import com.drew654.summary.domain.model.summary.PlayStart

data class PlayStartDto(
    val distance: Int,
    val down: Int,
    val yardLine: Int,
    val yardsToEndzone: Int
)

fun PlayStartDto.toPlayStart(): PlayStart {
    return PlayStart(
        distance = distance,
        down = down,
        yardLine = yardLine,
        yardsToEndzone = yardsToEndzone
    )
}
