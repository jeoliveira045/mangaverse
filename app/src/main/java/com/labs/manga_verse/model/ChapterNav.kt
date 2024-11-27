package com.labs.manga_verse.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ChapterNav (
    var nextSlug: String? = null,
    var nextURL: String? = null,
    var prevSlug: String? = null,
    var prevURL: String? = null
)
