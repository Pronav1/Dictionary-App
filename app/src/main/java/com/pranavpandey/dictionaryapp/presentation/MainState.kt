package com.pranavpandey.dictionaryapp.presentation

import com.pranavpandey.dictionaryapp.domain.model.WordItem

data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",
    val wordItem: WordItem?  = null
)
