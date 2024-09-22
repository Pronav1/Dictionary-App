package com.pranavpandey.dictionaryapp.data.mapper

import com.pranavpandey.dictionaryapp.data.dto.DefinitionDto
import com.pranavpandey.dictionaryapp.data.dto.MeaningDto
import com.pranavpandey.dictionaryapp.data.dto.WordItemDto
import com.pranavpandey.dictionaryapp.domain.model.Definition
import com.pranavpandey.dictionaryapp.domain.model.Meaning
import com.pranavpandey.dictionaryapp.domain.model.WordItem

fun WordItemDto.toWordItem() = WordItem(
    word = word ?: "",
    meaning = meanings?.map{ it.toMeaning()} ?: emptyList(),
    phonetic = phonetic?.firstOrNull()?.text ?: ""
)

fun MeaningDto.toMeaning() = Meaning(
    definition=  definitionDtoToDefinition( definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)

fun definitionDtoToDefinition(definitionDto: DefinitionDto?) =  Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""

)