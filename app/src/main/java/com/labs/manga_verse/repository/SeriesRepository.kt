package com.labs.manga_verse.repository

import com.labs.manga_verse.SeriesService
import com.labs.manga_verse.model.SeriesListNoPaginationRequest
import com.labs.manga_verse.model.SeriesListRequest

class SeriesRepository(private val seriesService: SeriesService = SeriesService())
{
    suspend fun getAllSeries(): SeriesListNoPaginationRequest
    {
        return seriesService.getAllSeries()
    }
}
