package com.example.foodappui.navigation

sealed class Screen(val route: String){
    object HomeScreen: Screen(route = "home_screen")
    object CatalogScreen: Screen(route = "catalog_screen")
    object CartScreen: Screen(route = "cart_screen")
    object ProfileScreen: Screen(route = "profile_screen")
}