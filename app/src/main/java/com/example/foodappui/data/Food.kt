package com.example.foodappui.data

import androidx.annotation.DrawableRes
import com.example.foodappui.R

data class Food(
    val id: Int,
    val name: String,
    @DrawableRes
    val imageResourceId: Int,
    val quantity: String
)
val foodList=listOf(
    Food(
        id = 1,
        name = "Truffle Tagliatelle",
        imageResourceId = R.drawable.ic_popular_food_6,
        quantity = "200 g"
    ),
    Food(
        id = 2,
        name = "Crème Brûlée",
        imageResourceId = R.drawable.ic_popular_food_5,
        quantity = "150 g"
    ),
    Food(
        id = 3,
        name = "Truffle Royale",
        imageResourceId = R.drawable.burger,
        quantity = "300 g"
    ),
    Food(
        id = 4,
        name = "Tournedos Rossini",
        imageResourceId = R.drawable.ic_popular_food_4,
        quantity = "180 g"
    ),
    Food(
        id = 5,
        name = "Mango Tango",
        imageResourceId = R.drawable.icecream,
        quantity = "200 ml"
    ),
    Food(
        id = 6,
        name = "Caramel Crush Shake",
        imageResourceId = R.drawable.mix_shake,
        quantity = "250 ml"

    ),
    Food(
        id = 7,
        name = "Pizza",
        imageResourceId = R.drawable.pizza,
        quantity = "600 g"

    ),
    Food(
        id = 8,
        name = "Lobster Thermidor",
        imageResourceId = R.drawable.ic_popular_food_3,
        quantity = "170 g"

    ),
    Food(
        id = 9,
        name = "Taco",
        imageResourceId = R.drawable.taco,
        quantity = "220 g"

    ),
    Food(
        id = 10,
        name = "Sunset Sizzler",
        imageResourceId = R.drawable.burger2,
        quantity = "350 g"

    ),
    Food(
        id = 11,
        name = "Salad",
        imageResourceId = R.drawable.salad,
        quantity = "180 g"

    ),
    Food(
        id = 12,
        name = "Chocolate Shake",
        imageResourceId = R.drawable.choclate_shake,
        quantity = "200 ml"
    ),
    Food(
        id = 13,
        name = "Risotto alla Milanese",
        imageResourceId = R.drawable.ic_popular_food_1,
        quantity = "160 g"

    ),
    Food(
        id = 14,
        name = "Toasted Coconut Snowfall",
        imageResourceId = R.drawable.mc_icecream,
        quantity = "200 ml"

    ),
    Food(
        id = 15,
        name = "Bouillabaisse",
        imageResourceId = R.drawable.ic_popular_food_2,
        quantity = "220 g"

    )
)