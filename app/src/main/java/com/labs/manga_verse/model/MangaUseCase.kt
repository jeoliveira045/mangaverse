//package com.labs.manga_verse.model
//
//import com.labs.manga_verse.service.MangaApiService
//
//
//class MangaUseCase(private val service: MangaApiService) {
//
//    suspend fun getArticles(): List<MangaInformation>? {
//        val articlesRaw = service.fetchMangaData("1")
//        return articlesRaw.mangaList;
//    }
//
//    private fun mapArticles(articlesRaw: List<MangaInformation>): List<MangaInformation> = articlesRaw.map { raw ->
//        Article(
//            raw.title,
//            raw.desc ?: "Click to find out more",
//            getDaysAgoString(raw.date),
//            raw.imageUrl
//                ?: "https://image.cnbcfm.com/api/v1/image/107326078-1698758530118-gettyimages-1765623456-wall26362_igj6ehhp.jpeg?v=1698758587&w=1920&h=1080"
//        )
//    }
//
//    private fun getDaysAgoString(date: String): String {
//        val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
//        val days = today.daysUntil(
//            Instant.parse(date).toLocalDateTime(TimeZone.currentSystemDefault()).date
//        )
//
//        val result = when {
//            abs(days) > 1 -> "${abs(days)} days ago"
//            abs(days) == 1 -> "Yesterday"
//            else -> "Today"
//        }
//
//        return result
//    }
//}
