package com.example.foodappui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.R
import com.example.foodappui.data.Restaurant
import com.example.foodappui.data.RestaurantType
import com.example.foodappui.ui.theme.LightGreyColor
import com.example.foodappui.ui.theme.OrangeColor
import com.example.foodappui.ui.theme.playfairFamily


@Composable
fun RestaurantItem(restaurant: Restaurant){
    Column(
        modifier = Modifier
    ) {
        Image(
            painter = painterResource(restaurant.imageResourceId),
            contentDescription = restaurant.name,
            modifier = Modifier
                .width(240.dp)
                .height(160.dp)
                .clip(RoundedCornerShape(10.dp))
        )
        Row(
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Text(
                text = restaurant.name,
                fontFamily = playfairFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                modifier = Modifier.width(200.dp)
            )
            Text(
                text = "${restaurant.rating}",
                color = OrangeColor,
                fontFamily = FontFamily.Serif,
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 5.dp)
            )
            Icon(
                imageVector = Icons.Default.Star,
                contentDescription = "star icon",
                tint = OrangeColor,
                modifier = Modifier.padding(top = 5.dp, start = 2.dp).size(18.dp)
            )
        }
        Row {
            Text(
                text = restaurant.type.displayName,
                color = LightGreyColor,
                fontSize = 15.sp
            )
            Text(
                text = "•",
                color = LightGreyColor,
                modifier = Modifier.padding(horizontal = 7.dp)
            )
            Text(
                text = "${restaurant.deliveryTimeMinutes} min",
                fontSize = 14.sp,
                color = LightGreyColor,
                fontFamily = FontFamily.Serif
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun RestaurantItemPreview(){
    RestaurantItem(
        restaurant = Restaurant(
            id = 1,
            name = "Sundown Cafe",
            imageResourceId = R.drawable.res_1,
            rating = 4.9f,
            type = RestaurantType.ITALIAN,
            deliveryTimeMinutes = 30
    ))
}