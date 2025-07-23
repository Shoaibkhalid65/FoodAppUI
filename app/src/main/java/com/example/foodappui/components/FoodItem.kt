package com.example.foodappui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.R
import com.example.foodappui.data.Food
import com.example.foodappui.ui.theme.LightBackground
import com.example.foodappui.ui.theme.LightGreyColor
import com.example.foodappui.ui.theme.OrangeColor
import com.example.foodappui.ui.theme.WhiteColor
import com.example.foodappui.ui.theme.playfairFamily

@Composable
fun FoodItem(food: Food){
    Column {
        val bitmap: ImageBitmap= ImageBitmap.imageResource(food.imageResourceId)
        val backgroundColor = averageColor(bitmap)
        Box(
            modifier = Modifier
                .requiredSize(120.dp)
                .aspectRatio(1f)
                .clip(RoundedCornerShape(12.dp))
                .background(backgroundColor.copy(0.3f))
        ){
            Image(
                painter = painterResource(food.imageResourceId),
                contentDescription = food.name,
                modifier = Modifier.size(95.dp).align(Alignment.Center),
                contentScale = ContentScale.Fit
            )
            FilledIconButton(
                onClick = {},
                modifier = Modifier
                    .padding(4.dp)
                    .size(24.dp)
                    .align(Alignment.TopEnd),
                colors = IconButtonDefaults.filledIconButtonColors(
                    containerColor = OrangeColor,
                    contentColor = Color.White
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "add icon",
                    modifier = Modifier.size(14.dp)
                )
            }
        }
        Text(
            text = food.name,
            fontWeight = FontWeight.Normal,
            fontFamily = playfairFamily,
            fontSize = 16.sp,
            modifier = Modifier.padding(vertical = 6.dp)
        )
        Text(
            text = "$${food.price}",
            fontFamily = FontFamily.Serif,
            fontSize = 14.sp,
            color = LightGreyColor
        )

    }
}


@Composable
@Preview(showBackground = true)
fun FoodItemPreview(){
    FoodItem(food = Food(id = 1, name = "Juice", R.drawable.icecream,"250 ml","Food is so good",2.34f))
}