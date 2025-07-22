package com.example.foodappui.data

import androidx.annotation.DrawableRes
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.ui.text.LinkAnnotation
import com.example.foodappui.R


enum class RestaurantType(val displayName:String){
    FAST_FOOD("Fast Food"),
    DESI("Desi"),
    CAFE("Cafe"),
    CHINESE("Chinese"),
    ITALIAN("Italian")
}
data class Restaurant(
    val id: Int,
    val name: String,
    @DrawableRes
    val imageResourceId: Int,
    val rating: Float,
    val type: RestaurantType,
    val deliveryTimeMinutes: Int
)
val restaurants=listOf(
    Restaurant(
        id = 0,
        name = "Taj Cafe",
        imageResourceId = R.drawable.res_1,
        rating = 4.6f,
        type = RestaurantType.ITALIAN,
        deliveryTimeMinutes = 30
    ),
    Restaurant(
        id = 1,
        name = "Burger House",
        imageResourceId = R.drawable.res_2,
        rating = 4.5f,
        type = RestaurantType.FAST_FOOD,
        deliveryTimeMinutes = 30
    ),
    Restaurant(
        id = 2,
        name = "Desi Dhaba",
        imageResourceId = R.drawable.res_3,
        rating = 4.2f,
        type = RestaurantType.DESI,
        deliveryTimeMinutes = 25
    ),
    Restaurant(
        id = 3,
        name = "Cafe Aroma",
        imageResourceId = R.drawable.res_4,
        rating = 4.7f,
        type = RestaurantType.CAFE,
        deliveryTimeMinutes = 20
    ),
    Restaurant(
        id = 4,
        name = "China Town",
        imageResourceId = R.drawable.res_5,
        rating = 4.3f,
        type = RestaurantType.CHINESE,
        deliveryTimeMinutes = 35
    ),
    Restaurant(
        id = 5,
        name = "Pasta Palace",
        imageResourceId = R.drawable.res_6,
        rating = 4.6f,
        type = RestaurantType.ITALIAN,
        deliveryTimeMinutes = 28
    )
)