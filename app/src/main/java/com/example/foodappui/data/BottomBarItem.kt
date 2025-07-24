package com.example.foodappui.data

import androidx.annotation.DrawableRes
import com.example.foodappui.R
import com.example.foodappui.navigation.Screen

enum class BottomBarItem (
    val route: String,
    @DrawableRes
    val imageResourceId: Int,
    val label: String
){
    HOME(
        route = Screen.HomeScreen.route,
        imageResourceId = R.drawable.home,
        label = "Home"
    ),
    CATALOG(
        route = Screen.CatalogScreen.route,
        imageResourceId = R.drawable.catalog,
        label = "Catalog"
    ),
    CART(
        route = Screen.CartScreen.route,
        imageResourceId = R.drawable.cart,
        label = "Cart"
    ),
    PROFILE(
        route = Screen.ProfileScreen.route,
        imageResourceId = R.drawable.profile,
        label = "Profile"
    )

}