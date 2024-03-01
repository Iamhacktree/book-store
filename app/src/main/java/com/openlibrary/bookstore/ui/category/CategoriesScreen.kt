package com.openlibrary.bookstore.ui.category

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.openlibrary.bookstore.ui.theme.MyBookTheme

@Composable
fun CategoriesScreen() {

    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "CategoriesScreen")
    }
}

@Preview
@Composable
fun PreviewCategoriesScreen() {
    MyBookTheme(dynamicColor = false) {
        CategoriesScreen()
    }
}