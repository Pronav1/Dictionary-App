package com.pranavpandey.dictionaryapp.data.dto

data class PhoneticDto(
    val audio: String,
    val license: License,
    val sourceUrl: String,
    val text: String
)