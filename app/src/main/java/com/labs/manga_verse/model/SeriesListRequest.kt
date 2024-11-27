package com.labs.manga_verse.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

//@Serializable
data class SeriesListRequest(
    @SerializedName("error")
    var error: Boolean?,
    @SerializedName("message")
    var message: String?,
    @SerializedName("data")
    var data: SeriesSummarize
)
