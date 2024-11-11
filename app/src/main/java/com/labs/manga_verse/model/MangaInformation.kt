package com.labs.manga_verse.model;

import kotlinx.serialization.Serializable;

@Serializable
data class MangaInformation(
        val id: String,
        val title: String,
        val subTitle: String,
        val status: String,
        val thumb: String,
        val summary: String,
        val authors: List<String>,
        val genres: List<String>,
        val nsfw: Boolean,
        val type: String,
        val totalChapter: Int,
        val createdAt: Long,
        val updatedAt: Long
)
