package com.labs.manga_verse.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.labs.manga_verse.R
import com.labs.manga_verse.ui.theme.MangaverseTheme
//import com.labs.manga_verse.viewmodel.MangaViewModel
//import io.ktor.client.request.request

@Composable
fun MangaDetalhe(
    modifier: Modifier
) {
    Column(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painterResource(R.drawable.bleach_manga),
            "manga_capa",
            modifier.size(500.dp).padding(top = 30.dp)
        )





    }

}

@Preview
@Composable
fun MangaDetalhePreview(){
    MangaverseTheme {
        MangaDetalhe(modifier = Modifier)
    }
}
