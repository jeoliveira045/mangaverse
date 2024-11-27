package com.labs.manga_verse.model;

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable;

//@Serializable
data class Series(
    @SerializedName("provider")
    var provider: String,
    @SerializedName("slug")
    var slug: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("sourceURL")
    var sourceURL: String,
    @SerializedName("coverURL")
    var coverURL: String,
    @SerializedName("synopsis")
    var synopsis: String,
    @SerializedName("genres")
    var genres: List<String>,
    @SerializedName("chaptersCount")
    var chaptersCount: Int,
    @SerializedName("latestChapter")
    var latestChapter: String,
)
