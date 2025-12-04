package com.drew654.summary.domain.model.summary

data class PlayEnd(
    val distance: Int,
    val down: Int,
    val downDistanceText: String?,
    val possessionText: String?,
    val shortDownDistanceText: String?,
    val yardLine: Int,
    val yardsToEndzone: Int
)
