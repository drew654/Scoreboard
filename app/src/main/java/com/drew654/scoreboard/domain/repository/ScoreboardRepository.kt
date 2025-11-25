package com.drew654.scoreboard.domain.repository

import com.drew654.scoreboard.data.remote.dto.ScoreboardDto

interface ScoreboardRepository {
    suspend fun getScoreboard(sport: String, league: String, week: Int?, seasonType: Int?): ScoreboardDto
}
