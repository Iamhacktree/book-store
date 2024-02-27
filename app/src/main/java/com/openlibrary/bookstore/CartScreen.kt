package com.openlibrary.bookstore

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.openlibrary.bookstore.ui.theme.MyBookTheme

@Composable
fun CartScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "CartScreen")
    }
}

@Preview
@Composable
fun PreviewCartScreen() {
    MyBookTheme(dynamicColor = false) {
        CartScreen()
    }
}