package com.drew654.summary.domain.repository

import com.drew654.summary.data.remote.dto.SummaryDto

interface SummaryRepository {
    suspend fun getSummary(event: Int): SummaryDto
}
