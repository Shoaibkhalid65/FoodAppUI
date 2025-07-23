package com.example.foodappui.data

import androidx.annotation.DrawableRes
import com.example.foodappui.R

data class Food(
    val id: Int,
    val name: String,
    @DrawableRes
    val imageResourceId: Int,
    val quantity: String,
    val detailedName: String,
    val price: Float
)
val foodList = listOf(
    Food(
        id = 1,
        name = "Tagliatelle",
        imageResourceId = R.drawable.ic_popular_food_6,
        quantity = "200 g",
        detailedName = "Truffle Infused Tagliatelle Pasta",
        price = 24.99f
    ),
    Food(
        id = 2,
        name = "Crème Brûlée",
        imageResourceId = R.drawable.ic_popular_food_5,
        quantity = "150 g",
        detailedName = "Classic French Crème Brûlée",
        price = 12.50f
    ),
    Food(
        id = 3,
        name = "Truffle Royale",
        imageResourceId = R.drawable.burger,
        quantity = "300 g",
        detailedName = "Truffle Royale Gourmet Burger",
        price = 18.75f
    ),
    Food(
        id = 4,
        name = "Tournedos",
        imageResourceId = R.drawable.ic_popular_food_4,
        quantity = "180 g",
        detailedName = "Tournedos Rossini with Foie Gras",
        price = 32.00f
    ),
    Food(
        id = 5,
        name = "Mango Tango",
        imageResourceId = R.drawable.icecream,
        quantity = "200 ml",
        detailedName = "Mango Tango Tropical Sorbet",
        price = 8.99f
    ),
    Food(
        id = 6,
        name = "Caramel Shake",
        imageResourceId = R.drawable.mix_shake,
        quantity = "250 ml",
        detailedName = "Salted Caramel Cream Shake",
        price = 7.50f
    ),
    Food(
        id = 7,
        name = "Pizza",
        imageResourceId = R.drawable.pizza,
        quantity = "600 g",
        detailedName = "Margherita Pizza with Basil",
        price = 15.99f
    ),
    Food(
        id = 8,
        name = "Lobster",
        imageResourceId = R.drawable.ic_popular_food_3,
        quantity = "170 g",
        detailedName = "Lobster Thermidor in Creamy Sauce",
        price = 45.00f
    ),
    Food(
        id = 9,
        name = "Taco",
        imageResourceId = R.drawable.taco,
        quantity = "220 g",
        detailedName = "Spicy Beef Taco Supreme",
        price = 9.25f
    ),
    Food(
        id = 10,
        name = "Sunset Sizzler",
        imageResourceId = R.drawable.burger2,
        quantity = "350 g",
        detailedName = "Sunset Sizzler BBQ Burger",
        price = 19.50f
    ),
    Food(
        id = 11,
        name = "Salad",
        imageResourceId = R.drawable.salad,
        quantity = "180 g",
        detailedName = "Fresh Garden Caesar Salad",
        price = 10.99f
    ),
    Food(
        id = 12,
        name = "Choco Shake",
        imageResourceId = R.drawable.choclate_shake,
        quantity = "200 ml",
        detailedName = "Rich Chocolate Bliss Shake",
        price = 7.75f
    ),
    Food(
        id = 13,
        name = "Risotto",
        imageResourceId = R.drawable.ic_popular_food_1,
        quantity = "160 g",
        detailedName = "Saffron Risotto Milanese Delight",
        price = 22.00f
    ),
    Food(
        id = 14,
        name = "Snowfall",
        imageResourceId = R.drawable.mc_icecream,
        quantity = "200 ml",
        detailedName = "Toasted Marshmallow Snowfall Dessert",
        price = 9.50f
    ),
    Food(
        id = 15,
        name = "Bouillabaisse",
        imageResourceId = R.drawable.ic_popular_food_2,
        quantity = "220 g",
        detailedName = "Mediterranean Bouillabaisse Seafood Stew",
        price = 28.75f
    )
)
val cartList=listOf(
    Food(
        id = 6,
        name = "Caramel Shake",
        imageResourceId = R.drawable.mix_shake,
        quantity = "250 ml",
        detailedName = "Salted Caramel Cream Shake",
        price = 7.50f
    ),
    Food(
        id = 7,
        name = "Pizza",
        imageResourceId = R.drawable.pizza,
        quantity = "600 g",
        detailedName = "Margherita Pizza with Basil",
        price = 15.99f
    ),
    Food(
        id = 8,
        name = "Lobster",
        imageResourceId = R.drawable.ic_popular_food_3,
        quantity = "170 g",
        detailedName = "Lobster Thermidor in Creamy Sauce",
        price = 45.00f
    ),
)