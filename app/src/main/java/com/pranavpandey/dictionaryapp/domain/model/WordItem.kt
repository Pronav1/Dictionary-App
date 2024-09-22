package com.pranavpandey.dictionaryapp.domain.model

import com.pranavpandey.dictionaryapp.data.dto.MeaningDto
import com.pranavpandey.dictionaryapp.data.dto.PhoneticDto

data class WordItem(
   val word: String,
    val meaning:List<Meaning>,
    val phonetic: String
)