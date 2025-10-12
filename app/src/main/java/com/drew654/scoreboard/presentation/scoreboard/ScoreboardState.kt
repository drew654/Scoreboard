package com.drew654.scoreboard.presentation.scoreboard

import com.drew654.scoreboard.domain.model.scoreboard.Scoreboard

data class ScoreboardState(
    val isLoading: Boolean = false,
    val scoreboard: Scoreboard? = null,
    val error: String = ""
)
