package com.labs.manga_verse.model

import kotlinx.serialization.Serializable

@Serializable
data class MangaPage(
    var prevPage: Int?,
    var nextPage: Int?,
    var total: Int?,
    var series: MangaInformation?
)

