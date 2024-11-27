package com.labs.manga_verse.composables

import android.content.Context
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.labs.manga_verse.R
import com.labs.manga_verse.model.Chapter
import com.labs.manga_verse.model.ChapterListRequest
import com.labs.manga_verse.ui.theme.MangaverseTheme
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

@Composable
fun MangaChapterItem(modifier: Modifier, resource: Chapter) {
    Row(
        modifier.padding(horizontal = 20.dp, vertical = 20.dp).clickable(enabled = true){}.fillMaxWidth().height(40.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    )
    {
        Text(text = "Chapter ${resource.number}")
        Icon(painter = painterResource(id = R.drawable.baseline_navigate_next_24), contentDescription = "Next Button")
    }
}

@Composable
@Preview
fun MangaChapterItemPreview(){
    var context = LocalContext.current
    MangaverseTheme {
        MangaChapterItem(modifier = Modifier, resource = loadChapterList(context, "chapterlist.json").data!!.chapters!!.get(0))
    }
}

fun loadChapterList(context: Context, fileName: String): ChapterListRequest {
    val jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
    return Json {ignoreUnknownKeys = true}.decodeFromString(jsonString)
}
