package com.labs.manga_verse.model

import com.google.gson.annotations.SerializedName


data class SeriesListNoPaginationRequest (
    @SerializedName("error")
    var error: Boolean?,
    @SerializedName("message")
    var message: String?,
    @SerializedName("data")
    var data: List<Series>
)
