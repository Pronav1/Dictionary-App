package com.pranavpandey.dictionaryapp.domain.repository

import com.pranavpandey.dictionaryapp.domain.model.WordItem
import com.pranavpandey.dictionaryapp.util.Result
import kotlinx.coroutines.flow.Flow


interface DictionaryRepository {
    suspend fun  getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}