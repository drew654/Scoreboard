package com.drew654.scoreboard.data.repository

import com.drew654.scoreboard.data.remote.EspnApi
import com.drew654.scoreboard.data.remote.dto.ScoreboardDto
import com.drew654.scoreboard.domain.repository.ScoreboardRepository
import javax.inject.Inject

class ScoreboardRepositoryImpl @Inject constructor(
    private val api: EspnApi
): ScoreboardRepository {
    override suspend fun getScoreboard(sport: String, league: String, week: Int?): ScoreboardDto {
        return api.getScoreboard(sport, league, week)
    }
}
