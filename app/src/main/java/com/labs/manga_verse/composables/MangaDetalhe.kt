package com.labs.manga_verse.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
//import com.labs.manga_verse.ApiConfig
//import coil.compose.AsyncImage
//import coil.compose.rememberImagePainter
//import coil.request.ImageRequest
import com.labs.manga_verse.model.Series
import com.labs.manga_verse.ui.theme.MangaverseTheme

//import com.labs.manga_verse.viewmodel.MangaViewModel
//import io.ktor.client.request.request

@Composable
fun MangaDetalhe(
    modifier: Modifier,
    mangaDetalhe: Series
) {
    var scrollState = rememberScrollState()
    Column(
        modifier
            .fillMaxWidth()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ) {
        Image(
            painter = rememberAsyncImagePainter(model = ImageRequest.Builder(LocalContext.current).data(mangaDetalhe.coverURL).build()),
            contentDescription ="",
            modifier = Modifier
                .size(400.dp)
                .padding(40.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = mangaDetalhe.title!!, modifier.padding(top=10.dp, start = 40.dp, end = 40.dp, ), fontSize = 24.sp)
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = mangaDetalhe.genres!!.joinToString(), modifier.padding(10.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = mangaDetalhe.synopsis!!, modifier.padding(10.dp))
        loadChapterList(LocalContext.current, "chapterlist.json").data!!.chapters!!.forEach { chapter ->
            MangaChapterItem(modifier = modifier, resource = chapter)
        }



    }
}

//@Preview
//@Composable
//fun MangaDetalhePreview(){
//    val client = remember { ApiConfig("series/nightscans?page=2&size=10") }
//
//    var data by remember { mutableStateOf("Carregando...") }
//
//    MangaverseTheme {
//        LaunchedEffect(Unit) {
//            data = client.fetchMangaData()!!
//        }
//        Text(text = data)
//
//    }
//}

