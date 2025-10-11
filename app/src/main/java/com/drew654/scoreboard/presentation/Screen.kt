package com.drew654.scoreboard.presentation

sealed class Screen(val route: String) {
    object Scoreboard: Screen("scoreboard")
}
