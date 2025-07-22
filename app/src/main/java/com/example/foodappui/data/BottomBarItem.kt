package com.example.foodappui.data

import androidx.annotation.DrawableRes
import com.example.foodappui.R

enum class BottomBarItem (
    val route: String,
    @DrawableRes
    val imageResourceId: Int,
    val label: String
){
    HOME(
        route = "home",
        imageResourceId = R.drawable.home,
        label = "Home"
    ),
    CATALOG(
        route = "catalog",
        imageResourceId = R.drawable.catalog,
        label = "Catalog"
    ),
    CART(
        route = "cart",
        imageResourceId = R.drawable.cart,
        label = "Cart"
    ),
    PROFILE(
        route = "profile",
        imageResourceId = R.drawable.profile,
        label = "Profile"
    )

}