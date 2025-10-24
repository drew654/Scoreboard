package com.drew654.scoreboard.presentation.scoreboard

import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.domain.model.scoreboard.ListCalendarEntry
import com.drew654.scoreboard.domain.model.scoreboard.Scoreboard

data class ScoreboardState(
    val isLoading: Boolean = false,
    val error: String = "",
    val scoreboard: Scoreboard? = null,
    val competitions: List<Competition> = emptyList(),
    val calendarEntries: List<ListCalendarEntry> = emptyList()
)
