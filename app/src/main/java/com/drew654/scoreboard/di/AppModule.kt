package com.drew654.scoreboard.di

import com.drew654.scoreboard.common.Constants
import com.drew654.scoreboard.data.remote.EspnApi
import com.drew654.scoreboard.data.repository.ScoreboardRepositoryImpl
import com.drew654.scoreboard.domain.repository.ScoreboardRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideEspnApi(okHttpClient: OkHttpClient): EspnApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(EspnApi::class.java)
    }

    @Provides
    @Singleton
    fun provideScoreboardRepository(api: EspnApi): ScoreboardRepository {
        return ScoreboardRepositoryImpl(api)
    }
}
