package com.drew654.scoreboard.domain.use_case.get_scoreboard

import com.drew654.scoreboard.common.Resource
import com.drew654.scoreboard.data.remote.dto.toScoreboard
import com.drew654.scoreboard.domain.model.scoreboard.Scoreboard
import com.drew654.scoreboard.domain.repository.ScoreboardRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetScoreboardUseCase @Inject constructor(
    private val repository: ScoreboardRepository
) {
    operator fun invoke(sport: String, league: String, week: Int?, seasonType: Int?): Flow<Resource<Scoreboard>> = flow {
        try {
            emit(Resource.Loading<Scoreboard>())
            val scoreboard = repository.getScoreboard(sport, league, week, seasonType).toScoreboard()
            emit(Resource.Success<Scoreboard>(scoreboard))
        } catch (e: HttpException) {
            emit(Resource.Error<Scoreboard>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<Scoreboard>("Couldn't reach server. Check your internet connection."))
        }
    }
}
