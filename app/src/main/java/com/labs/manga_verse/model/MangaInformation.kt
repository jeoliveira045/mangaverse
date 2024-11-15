package com.labs.manga_verse.model;

import kotlinx.serialization.Serializable;

@Serializable
data class MangaInformation(
    var provider: String?,
    var slug: String?,
    var title: String?,
    var sourceURL: String?,
    var coverURL: String?,
    var synopsis: String?,
    var genres: List<String?>?,
    var chaptersCount: Int?,
    var latestChapter: String?,
)
