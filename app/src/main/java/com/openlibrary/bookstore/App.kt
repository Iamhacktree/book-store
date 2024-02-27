package com.openlibrary.bookstore

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.openlibrary.bookstore.ui.theme.BottomNavItem
import com.openlibrary.bookstore.ui.theme.MyBookTheme
import com.openlibrary.bookstore.ui.theme.Screen

@Composable
fun App() {

    val navController = rememberNavController()

    MyBookTheme {
        Scaffold(
            bottomBar = {
                BottomBar(navController)
            },
            topBar = {
                TopBar(navController)
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                Navigation(navController)
            }

        }
    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val bottomNavItems = listOf(
        BottomNavItem.Home,
        BottomNavItem.Categories,
        BottomNavItem.Cart,
        BottomNavItem.Account
    )
    var tabSelected by remember { mutableStateOf(BottomNavItem.Home) }

    NavigationBar(modifier = Modifier.fillMaxWidth()) {

        bottomNavItems.iterator().forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon.selected,
                        contentDescription = stringResource(id = item.title)
                    )
                },
                label = { Text(text = stringResource(id = item.title)) },
                alwaysShowLabel = true,
                colors = NavigationBarItemDefaults.colors(
                    indicatorColor = Color.Black,
                    selectedIconColor = Color.White,
                    unselectedIconColor = Color.Black
                ),
                selected = item == tabSelected,
                onClick = {
                    navController.navigate(item.screen.route)
                    tabSelected = item
                }
            )
        }
    }
}

@Composable
fun TopBar(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            modifier = Modifier
                .padding(start = 24.dp)
                .align(Alignment.CenterStart)
        )
    }
}

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) {
            HomeScreen()
        }
        composable(route = Screen.Categories.route) {
            CategoriesScreen()
        }
        composable(route = Screen.Cart.route) {
            CartScreen()
        }
        composable(route = Screen.Account.route) {
            AccountScreen()
        }
    }
}