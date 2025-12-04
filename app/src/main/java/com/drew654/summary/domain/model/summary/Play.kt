package com.drew654.summary.domain.model.summary

import java.time.Instant

data class Play(
    val awayScore: Int,
    val end: PlayEnd,
    val homeScore: Int,
    val modified: Instant,
    val priority: Boolean,
    val scoringPlay: Boolean,
    val sequenceNumber: Int,
    val start: PlayStart,
    val startYardage: Int,
    val text: String,
    val type: PlayType,
    val wallclock: Instant?
)
