package com.labs.manga_verse.model

import kotlinx.serialization.Serializable

@Serializable
data class ChapterListRequest(
    var error: Boolean?,
    var message: String?,
    var data: ChapterListSummarize?
)

