package com.labs.manga_verse.composables

import android.content.Context
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.labs.manga_verse.model.Series
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Composable
fun MangaLista(
    modifier: Modifier
) {
    var context = LocalContext.current
    LazyColumn {
//        this.items(items = loadJsonFromAssets(context, "mangalist.json")) {
//            item -> MangaDetalhe(modifier = Modifier)
//        }
    }
}



fun loadJsonFromAssets(context: Context, fileName: String): List<Series> {
    val jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
    return Json.decodeFromString(jsonString)
}
