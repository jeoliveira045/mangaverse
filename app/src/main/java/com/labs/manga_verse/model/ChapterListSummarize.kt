package com.labs.manga_verse.model

import kotlinx.serialization.Serializable

@Serializable
data class ChapterListSummarize (
    var total: Int?,
    var chapters: List<Chapter>?
)
