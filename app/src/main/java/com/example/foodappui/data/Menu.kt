package com.example.foodappui.data

import androidx.annotation.DrawableRes
import com.example.foodappui.R

data class Menu(
    val name: String,
    @DrawableRes
    val imageResourceId: Int
)
val menuList=listOf(
    Menu(
        name = "Cookies",
        imageResourceId = R.drawable.crop_cookies
    ),
    Menu(
        name="Drinks",
        imageResourceId = R.drawable.crop_drinks
    ),
    Menu(
        name = "Deserts",
        imageResourceId = R.drawable.crop_deserts
    ),
    Menu(
        name = "Pizza",
        imageResourceId = R.drawable.crop_pizza
    ),
    Menu(
        name = "Salad",
        imageResourceId = R.drawable.crop_salad
    )
)