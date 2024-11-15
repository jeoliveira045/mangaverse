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
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
//import coil.compose.AsyncImage
//import coil.compose.rememberImagePainter
//import coil.request.ImageRequest
import com.labs.manga_verse.R
import com.labs.manga_verse.model.MangaInformation
import com.labs.manga_verse.ui.theme.MangaverseTheme
import okhttp3.OkHttpClient
import okhttp3.Request

//import com.labs.manga_verse.viewmodel.MangaViewModel
//import io.ktor.client.request.request

@Composable
fun MangaDetalhe(
    modifier: Modifier,
    mangaDetalhe: MangaInformation
) {

    var scrollState = rememberScrollState()
    Column(
        modifier.fillMaxWidth().verticalScroll(scrollState).padding(16.dp)
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
    }
}

@Preview
@Composable
fun MangaDetalhePreview(){
    var context = LocalContext.current

    MangaverseTheme {
        MangaDetalhe(modifier = Modifier, loadMangaInformation(LocalContext.current, "mangadetail.json"))
    }
}


