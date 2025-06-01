package com.example.musicappui.ui.theme

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BrowseScreen(){
    val categories = listOf("Hits","Happy","Running","TGIF","Yoga")
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        items(categories){
            cat ->
            BrowserItem(cat = cat,drawable= com.example.musicappui.R.drawable.baseline_browse )
        }
    }
}

@Preview
@Composable
fun PreviewBro(){
    BrowseScreen()
}