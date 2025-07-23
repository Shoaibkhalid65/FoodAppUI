package com.example.foodappui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.data.restaurants
import com.example.foodappui.ui.theme.playfairFamily


@Composable
@Preview(showBackground = true)
fun RestaurantRowLayout(){
    Column (
        modifier = Modifier.padding(start = 20.dp)
    ){
        Text(
            text = "Places",
            fontFamily = playfairFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(vertical = 8.dp),
            fontSize = 22.sp
        )
        LazyRow (
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(end = 12.dp)
        ){
            items(restaurants){restaurant->
                RestaurantItem(restaurant = restaurant)
            }
        }
    }
}