package com.openlibrary.bookstore.ui.home

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.openlibrary.bookstore.model.BookModel
import com.openlibrary.bookstore.ui.theme.MyBookTheme

@Composable
fun HomeScreen() {
    val viewModel = hiltViewModel<HomeViewModel>()

    val state by remember { viewModel.getAll() }.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Love book",
            modifier = Modifier.padding(16.dp),
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleLarge
        )

        LazyRow {
            items(state.size) {
                Log.d("TODO", "HomeScreen items : $it")
                val item = state[it]
                VerticalPagerItem(item) { item ->
                    val id = item.id.removePrefix("/works/")
                    //navigator.navigate("/details/${id}")
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewHomeScreen() {
    MyBookTheme(dynamicColor = false) {
        HomeScreen()
    }
}

@Composable
fun VerticalPagerItem(item: BookModel, onClick: (BookModel) -> Unit) {
    Card(
        modifier = Modifier
            .width(170.dp)
            .height(270.dp)
            .padding(start = 16.dp)
            .clickable { onClick(item) },
        shape = RoundedCornerShape(5.dp),
    ) {
        Column {

            Image(
                painter = rememberAsyncImagePainter(item.image),
                contentScale = ContentScale.Crop,
                contentDescription = null,
                modifier = Modifier
                    .weight(0.7f)
                    .fillMaxWidth()
            )

            Column(
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxWidth()
                    .background(Color.Black)
                    .padding(10.dp),
                horizontalAlignment = Alignment.Start
            ) {

                Text(
                    text = item.type,
                    style = TextStyle(
                        fontSize = 10.85.sp,
                        fontWeight = FontWeight(300),
                        color = Color(0xFFDEDEDE),
                    )
                )

                Text(
                    text = item.title,
                    maxLines = 2,
                    style = TextStyle(
                        fontSize = 15.2.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFFFFFF),
                    )
                )

                Text(
                    text = item.author,
                    maxLines = 1,
                    style = TextStyle(
                        fontSize = 10.85.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                    )
                )

                Spacer(modifier = Modifier.weight(1f))

                Text(
                    text = "$${item.price}",
                    style = TextStyle(
                        fontSize = 21.71.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFFFFFF),
                    )
                )
            }
        }
    }
}