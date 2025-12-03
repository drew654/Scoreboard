package com.drew654.summary.data.repository

import com.drew654.summary.data.remote.SummaryApi
import com.drew654.summary.data.remote.dto.SummaryDto
import com.drew654.summary.domain.repository.SummaryRepository
import javax.inject.Inject

class SummaryRepositoryImpl @Inject constructor(
    private val api: SummaryApi
): SummaryRepository {
    override suspend fun getSummary(event: Int): SummaryDto {
        return api.getSummary(event)
    }
}
