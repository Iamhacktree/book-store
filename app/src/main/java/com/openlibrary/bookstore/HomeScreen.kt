package com.openlibrary.bookstore

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.openlibrary.bookstore.ui.theme.MyBookTheme

@Composable
fun HomeScreen(){
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "HomeScreen")
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    MyBookTheme(dynamicColor = false) {
        HomeScreen()
    }
}