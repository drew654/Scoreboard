package com.drew654.scoreboard.presentation

import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.Locale

fun formatHour(localDateTime: Instant, is24HourFormat: Boolean): String {
    return localDateTime.let {
        val pattern = if (is24HourFormat) "H:mm" else "h:mm a"
        val formatter = DateTimeFormatter.ofPattern(pattern, Locale.getDefault())
        val formattedTime = it.atZone(java.time.ZoneId.systemDefault()).format(formatter)
        return formattedTime
    }
}
