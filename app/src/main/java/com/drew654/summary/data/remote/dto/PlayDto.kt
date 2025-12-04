package com.drew654.summary.data.remote.dto

import com.drew654.summary.domain.model.summary.Play
import java.time.Instant
import java.time.format.DateTimeFormatter

data class PlayDto(
    val awayScore: Int,
    val end: PlayEndDto,
    val homeScore: Int,
    val modified: String,
    val priority: Boolean,
    val scoringPlay: Boolean,
    val sequenceNumber: String,
    val start: PlayStartDto,
    val startYardage: Int,
    val text: String,
    val type: PlayTypeDto,
    val wallclock: String?
)

fun PlayDto.toPlay(): Play {
    val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    return Play(
        awayScore = awayScore,
        end = end.toPlayEnd(),
        homeScore = homeScore,
        modified = Instant.from(formatter.parse(modified)),
        priority = priority,
        scoringPlay = scoringPlay,
        sequenceNumber = sequenceNumber.toInt(),
        start = start.toPlayStart(),
        startYardage = startYardage,
        text = text,
        type = type.toPlayType(),
        wallclock = if (wallclock == null) null else Instant.from(formatter.parse(wallclock))
    )
}
