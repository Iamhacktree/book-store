package com.openlibrary.bookstore.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.openlibrary.bookstore.R

data class BottomNavResource(
    val selected: ImageVector,
    val unselected: ImageVector,
)

enum class BottomNavItem(
    val title: Int,
    val icon: BottomNavResource,
    val screen: Screen,
) {
    Home(
        R.string.tabbar_title_home,
        BottomNavResource(
            Icons.Rounded.Home,
            Icons.Rounded.Home,
        ),
        Screen.Home
    ),
    Categories(
        R.string.tabbar_title_categories,
        BottomNavResource(
            Icons.Filled.List,
            Icons.Filled.List,
        ),
        Screen.Categories
    ),
    Cart(
        R.string.tabbar_title_cart,
        BottomNavResource(
            Icons.Rounded.ShoppingCart,
            Icons.Rounded.ShoppingCart,
        ),
        Screen.Cart
    ),

    Account(
        R.string.tabbar_title_account,
        BottomNavResource(
            Icons.Rounded.AccountBox,
            Icons.Rounded.AccountBox,
        ),
        Screen.Account
    )
}