package com.labs.manga_verse

import com.labs.manga_verse.model.SeriesListNoPaginationRequest
import com.labs.manga_verse.model.SeriesListRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

class SeriesService {
    private lateinit var api: SeriesApi
    var url = "https://manga-scraper1.p.rapidapi.com/api/v1/series/nightscans"

    init {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://manga-scraper1.p.rapidapi.com/api/v1/series/nightscans/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(SeriesApi::class.java)
    }

    suspend fun getAllSeries(): SeriesListNoPaginationRequest{
        return api.getSeries()
    }

    interface SeriesApi{
        @GET("_all")
        @Headers("x-rapidapi-host: manga-scraper1.p.rapidapi.com", "x-rapidapi-key: 16368228ddmsh46d9e2cbb67c9a5p175e79jsn929dbf4d99f7")
        suspend fun getSeries(): SeriesListNoPaginationRequest

    }




}
