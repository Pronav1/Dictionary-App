package com.pranavpandey.dictionaryapp.data.dto

data class WordItemDto(
    val meanings: List<MeaningDto>? = null,
    val phonetic: List<PhoneticDto>? = null,
    val word: String? = null
)