package com.drew654.scoreboard.presentation

sealed class Screen(val route: String) {
    object Scoreboard : Screen("scoreboard")
    object Competition : Screen("competition")
}

object ScoreboardFeature {
    const val ROUTE = "scoreboard_feature"
}
