package com.labs.manga_verse.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import android.content.Context
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
//import coil.compose.AsyncImage
//import coil.compose.rememberImagePainter
//import coil.request.ImageRequest
import com.labs.manga_verse.R
import com.labs.manga_verse.model.MangaInformation
import com.labs.manga_verse.ui.theme.MangaverseTheme
//import com.labs.manga_verse.viewmodel.MangaViewModel
//import io.ktor.client.request.request

@Composable
fun MangaDetalhe(
    modifier: Modifier,
    mangaDetalhe: MangaInformation
) {
    Image(
        painter = rememberAsyncImagePainter(model = ImageRequest.Builder(LocalContext.current).data(mangaDetalhe.thumb).build()),
        contentDescription ="",
        modifier = Modifier.size(400.dp)
    )
}

@Preview
@Composable
fun MangaDetalhePreview(){
    var context = LocalContext.current

    MangaverseTheme {
        MangaDetalhe(modifier = Modifier, loadMangaInformation(LocalContext.current, "mangadetail.json"))
    }
}

fun loadMangaInformation(context: Context, fileName: String): MangaInformation {
    val jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
    return Json {ignoreUnknownKeys = true}.decodeFromString(jsonString)
}
