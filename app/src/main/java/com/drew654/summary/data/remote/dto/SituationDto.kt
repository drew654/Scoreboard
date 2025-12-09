package com.drew654.summary.data.remote.dto

import com.drew654.scoreboard.domain.model.scoreboard.Situation

data class SituationDto(
    val awayTimeouts: Int,
    val distance: Int,
    val down: Int,
    val downDistanceText: String?,
    val homeTimeouts: Int,
    val isRedZone: Boolean,
    val lastPlay: LastPlayDto,
    val possessionText: String?,
    val shortDownDistanceText: String?,
    val yardLine: Int
)

fun SituationDto.toSituation(): Situation {
    return Situation(
        awayTimeouts = awayTimeouts,
        distance = distance,
        down = down,
        downDistanceText = downDistanceText,
        homeTimeouts = homeTimeouts,
        isRedZone = isRedZone,
        lastPlay = lastPlay.toLastPlay(),
        possessionText = possessionText,
        shortDownDistanceText = shortDownDistanceText,
        yardLine = yardLine
    )
}
