package com.labs.manga_verse.model;

import kotlinx.serialization.Serializable

@Serializable
data class Chapter (
    var provider: String?,
    var series: String?,
    var slug: String?,
    var number: Int?,
    var fullTitle: String?,
    var shortTitle: String?,
    var sourceURL: String?,
    var chapterNav: ChapterNav?,
    var contentURLs: List<String>?,
    var sourceHref: String?
)
