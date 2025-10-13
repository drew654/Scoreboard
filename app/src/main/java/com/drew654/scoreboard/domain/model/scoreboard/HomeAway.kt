package com.drew654.scoreboard.domain.model.scoreboard

sealed class HomeAway(val value: String) {
    data object HOME : HomeAway("home")
    data object AWAY : HomeAway("away")
}
