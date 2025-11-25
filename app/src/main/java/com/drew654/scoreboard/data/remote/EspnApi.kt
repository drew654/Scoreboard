package com.drew654.scoreboard.data.remote

import com.drew654.scoreboard.data.remote.dto.ScoreboardDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EspnApi {
    @GET("/apis/site/v2/sports/{sport}/{league}/scoreboard")
    suspend fun getScoreboard(
        @Path("sport") sport: String,
        @Path("league") league: String,
        @Query("seasontype") seasonType: Int?,
        @Query("week") week: Int?,
    ): ScoreboardDto
}
