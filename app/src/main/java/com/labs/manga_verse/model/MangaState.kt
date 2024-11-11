package com.labs.manga_verse.model

import kotlinx.serialization.Serializable

@Serializable
data class MangaState(
    var code: Int? = 200,
    var mangaList: List<MangaInformation>? = mutableListOf()
)
