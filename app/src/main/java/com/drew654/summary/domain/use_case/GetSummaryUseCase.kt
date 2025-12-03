package com.drew654.summary.domain.use_case

import coil.network.HttpException
import com.drew654.scoreboard.common.Resource
import com.drew654.summary.data.remote.dto.toSummary
import com.drew654.summary.domain.model.summary.Summary
import com.drew654.summary.domain.repository.SummaryRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import javax.inject.Inject

class GetSummaryUseCase @Inject constructor(
    private val repository: SummaryRepository
) {
    operator fun invoke(event: Int): Flow<Resource<Summary>> = flow {
        try {
            emit(Resource.Loading<Summary>())
            val summary = repository.getSummary(event).toSummary()
            emit(Resource.Success<Summary>(summary))
        } catch (e: HttpException) {
            emit(Resource.Error<Summary>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<Summary>("Couldn't reach server. Check your internet connection."))
        }
    }
}
