package com.drew654.scoreboard.presentation

import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.Locale

fun formatTime(instant: Instant, is24HourFormat: Boolean): String {
    val pattern = if (is24HourFormat) "H:mm" else "h:mm a"
    val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
    val formattedTime = instant.atZone(java.time.ZoneId.systemDefault()).format(formatter)
    return formattedTime
}
