package com.pranavpandey.dictionaryapp.di

import com.pranavpandey.dictionaryapp.data.api.DictionaryApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class MainModule {

  private val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
      level = HttpLoggingInterceptor.Level.BODY
}
    private val client : OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .build()

    @Provides
    @Singleton
    fun provideDictionaryApi(): DictionaryApi{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(DictionaryApi.BASE_URL)
            .client(client)
            .build()
            .create()
    }

}