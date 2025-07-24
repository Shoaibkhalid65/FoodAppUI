package com.example.foodappui.components

import androidx.compose.foundation.clickable
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.data.foodList
import com.example.foodappui.ui.theme.playfairFamily

@Composable
fun CatalogRowLayout(onItemClick:(Int)-> Unit){
    Column (
        modifier = Modifier.padding(top = 20.dp, start = 20.dp)
    ){
        Text(
            text = "Add to Order",
            fontFamily = playfairFamily,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )
        LazyRow(
            modifier = Modifier.padding(top = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(end = 8.dp)
        ) {
            items(foodList){food->
                FoodItem(
                    food=food,
                    modifier = Modifier.clickable{
                        onItemClick(food.id)
                    }
                )
            }
        }
    }
}