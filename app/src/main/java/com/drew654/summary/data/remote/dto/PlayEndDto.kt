package com.drew654.summary.data.remote.dto

import com.drew654.summary.domain.model.summary.PlayEnd

data class PlayEndDto(
    val distance: Int,
    val down: Int,
    val downDistanceText: String?,
    val possessionText: String?,
    val shortDownDistanceText: String?,
    val yardLine: Int,
    val yardsToEndzone: Int
)

fun PlayEndDto.toPlayEnd(): PlayEnd {
    return PlayEnd(
        distance = distance,
        down = down,
        downDistanceText = downDistanceText,
        possessionText = possessionText,
        shortDownDistanceText = shortDownDistanceText,
        yardLine = yardLine,
        yardsToEndzone = yardsToEndzone
    )
}
