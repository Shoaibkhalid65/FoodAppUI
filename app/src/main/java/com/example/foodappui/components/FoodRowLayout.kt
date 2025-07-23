package com.example.foodappui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.R
import com.example.foodappui.data.foodList
import com.example.foodappui.ui.theme.playfairFamily

@Composable
@Preview(showBackground = true)
fun FoodRowLayout(){
    Column (
        modifier = Modifier.padding(top = 20.dp, start = 20.dp)
    ){
        Row {
            Text(
                text = "Best prices",
                fontFamily = playfairFamily,
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium
            )
            Icon(
                painter = painterResource(R.drawable.discount_badge),
                contentDescription = "discount badge",
                tint = Color(0xFF3BC24D),
                modifier = Modifier.padding(start = 5.dp, top = 2.dp).size(28.dp)
            )
        }
        LazyRow(
           modifier = Modifier.padding(top = 8.dp),
           horizontalArrangement = Arrangement.spacedBy(8.dp),
           contentPadding = PaddingValues(end = 8.dp)
        ) {
            items(foodList){food->
                FoodItem(food=food)
            }
        }
    }
}