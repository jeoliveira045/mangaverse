package com.labs.manga_verse.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text

import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import com.labs.manga_verse.model.Series
import com.labs.manga_verse.model.SeriesItemSummarize
import com.labs.manga_verse.ui.theme.MangaverseTheme
import com.labs.manga_verse.viewmodel.MangaViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

private var json = Json { ignoreUnknownKeys = true }

@Composable
fun MangaListItem() {
    var seriesViewModel: MangaViewModel = viewModel()
    var rememberSeries by rememberSaveable { mutableStateOf(emptyList<Series>()) }
    LaunchedEffect(key1 = "GET_SERIES") {
        rememberSeries = seriesViewModel.getAllSeries()
        rememberSeries.forEach {series -> println(series) }
    }
    LazyColumn {
        items(rememberSeries){ item ->
            MangaTest(series = item)
        }
    }
}
@Composable
fun MangaTest(series: Series){
    AsyncImage(model = series.coverURL, contentDescription = "model", modifier = Modifier.size(200.dp))
}
@Composable
@Preview
fun MangaItemPreview(){
    var context = LocalContext.current
    MangaverseTheme {
        MangaListItem()
    }
}



