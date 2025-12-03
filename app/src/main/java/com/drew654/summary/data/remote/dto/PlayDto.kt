package com.drew654.summary.data.remote.dto

import com.drew654.summary.domain.model.summary.Play
import java.time.Instant
import java.time.format.DateTimeFormatter

data class PlayDto(
    val awayScore: Int,
    val homeScore: Int,
    val modified: String,
    val priority: Boolean,
    val scoringPlay: Boolean,
    val sequenceNumber: String,
    val startYardage: Int,
    val text: String,
    val wallclock: String?
)

fun PlayDto.toPlay(): Play {
    val formatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME
    return Play(
        awayScore = awayScore,
        homeScore = homeScore,
        modified = Instant.from(formatter.parse(modified)),
        priority = priority,
        scoringPlay = scoringPlay,
        sequenceNumber = sequenceNumber.toInt(),
        startYardage = startYardage,
        text = text,
        wallclock = if (wallclock == null) null else Instant.from(formatter.parse(wallclock))
    )
}
