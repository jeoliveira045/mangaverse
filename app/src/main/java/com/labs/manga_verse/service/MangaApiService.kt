//package com.labs.manga_verse.service
//
//import com.labs.manga_verse.model.MangaState
//import io.ktor.client.*
//import io.ktor.client.call.*
//import io.ktor.client.request.*
//import io.ktor.client.plugins.contentnegotiation.*
//import io.ktor.serialization.kotlinx.json.*
//import kotlinx.serialization.json.Json
//
//
//class MangaApiService {
//
//    private val client = HttpClient {
//        install(ContentNegotiation) {
//            json(Json {
//                ignoreUnknownKeys = true // Ignora campos desconhecidos na resposta JSON
//                isLenient = true
//            })
//        }
//    }
//
//
//
//    suspend fun fetchMangaData(page: String): MangaState {
//        return client.get("https://mangaverse-api.p.rapidapi.com/manga/fetch?page=$page&genres=Fantasy&nsfw=false&type=all"){
//                header("X-Rapidapi-host", "mangaverse-api.p.rapidapi.com")
//                header("X-Rapidapi-key", "16368228ddmsh46d9e2cbb67c9a5p175e79jsn929dbf4d99f7")
//            }.body()
////        } catch (e: Exception) {
////            e.printStackTrace()
////            null
////        }
//    }
//}
//
//
