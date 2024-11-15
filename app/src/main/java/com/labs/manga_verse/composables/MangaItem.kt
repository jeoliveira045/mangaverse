package com.labs.manga_verse.composables

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.labs.manga_verse.model.MangaInformation
import com.labs.manga_verse.ui.theme.MangaverseTheme
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Composable
fun MangaItem(
    modifier: Modifier,
    mangaDetalhe: MangaInformation
){


}

@Composable
@Preview
fun MangaItemPreview(){
    var context = LocalContext.current

    MangaverseTheme {
        MangaItem(Modifier, loadMangaInformation(context, "mangadetail.json"))
    }
}

fun loadMangaInformation(context: Context, fileName: String): MangaInformation {
    val jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
    return Json {ignoreUnknownKeys = true}.decodeFromString(jsonString)
}

