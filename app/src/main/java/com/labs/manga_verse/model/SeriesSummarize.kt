package com.labs.manga_verse.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

//@Serializable
data class SeriesSummarize(
    @SerializedName("prevPage")
    var prevPage: Int?,
    @SerializedName("nextPage")
    var nextPage: Int,
    @SerializedName("total")
    var total: Int,
    @SerializedName("series")
    var series: List<Series>
)

