package com.pranavpandey.dictionaryapp.data.api

import com.pranavpandey.dictionaryapp.data.dto.WordResultDto
import retrofit2.http.GET
import retrofit2.http.Path



interface DictionaryApi {
    @GET("{Word}")
    suspend fun  getWordResult(
        @Path("word") word: String
    ): WordResultDto?
    companion object{
        const val BASE_URL = "https://api.dictionaryapi.dev/api/v2/entries/en"
    }
}