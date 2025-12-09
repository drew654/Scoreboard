package com.drew654.scoreboard.data.repository

import com.drew654.scoreboard.data.remote.dto.ScoreboardDto
import com.drew654.scoreboard.domain.repository.ScoreboardRepository
import com.drew654.scoreboard.presentation.preview.MockData
import javax.inject.Inject

class MockScoreboardRepositoryImpl @Inject constructor() : ScoreboardRepository {
    override suspend fun getScoreboard(
        sport: String,
        league: String,
        week: Int?,
        seasonType: Int?
    ): ScoreboardDto {
        return MockData.sampleScoreboardDto
    }
}
