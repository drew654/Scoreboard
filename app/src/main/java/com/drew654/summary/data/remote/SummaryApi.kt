package com.drew654.summary.data.remote

import com.drew654.summary.data.remote.dto.SummaryDto
import retrofit2.http.GET
import retrofit2.http.Query

interface SummaryApi {
    @GET("/apis/site/v2/sports/football/college-football/summary")
    suspend fun getSummary(
        @Query("event") event: Int
    ): SummaryDto
}
