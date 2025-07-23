package com.example.foodappui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.R
import com.example.foodappui.data.Menu
import com.example.foodappui.ui.theme.OrangeColor
import com.example.foodappui.ui.theme.WhiteColor
import com.example.foodappui.ui.theme.playfairFamily

@Composable
fun FirstMenuItem(modifier: Modifier= Modifier){
    val iconSize=32.dp
    Box(
        modifier = modifier
            .aspectRatio(ratio = 1f)
            .fillMaxWidth()
            .background(OrangeColor, RoundedCornerShape(16.dp)),
    ){
        Text(
            text = "Specials of the week",
            fontSize = 13.sp,
            fontFamily = playfairFamily,
            color = Color.White,
            modifier = Modifier
                .padding(start = 12.dp, top = 8.dp, end = 12.dp)
                .align(Alignment.TopStart),
            fontWeight = FontWeight.Medium
        )
        Icon(
            painter = painterResource(R.drawable.fifty_percent),
            contentDescription = "fifty percent discount icon",
            modifier = Modifier
                .padding(bottom = 12.dp, start = 16.dp)
                .size(iconSize)
                .align(Alignment.BottomStart),
            tint = Color(0xFF8FE0CB)
        )
        Icon(
            painter = painterResource(R.drawable.discount),
            contentDescription = "discount icon",
            modifier = Modifier
                .padding(end = 8.dp, bottom = 4.dp)
                .size(iconSize)
                .align(Alignment.CenterEnd),
            tint = Color(0xFFB9F6CA)
        )
        Icon(
            painter = painterResource(R.drawable.ten_percent),
            contentDescription = "ten percent discount icon",
            modifier = Modifier
                .padding(end =12.dp, bottom = 3.dp)
                .size(iconSize)
                .align(Alignment.BottomEnd),
            tint = Color(0xFFB2FF59)
        )


    }
}
@Composable
fun MenuItem(menu: Menu){
    Box(
        modifier = Modifier
            .aspectRatio(1f)
            .fillMaxWidth()
            .background(WhiteColor, RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
    ){
        Text(
            text = menu.name,
            fontFamily = playfairFamily,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(6.dp)
                .align(Alignment.TopStart)
        )
        Image(
            painter = painterResource(menu.imageResourceId),
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .align(Alignment.BottomEnd)
                .background(WhiteColor,RoundedCornerShape(12.dp)),
            contentScale = ContentScale.Crop
        )
    }
}
@Preview(showBackground = true)
@Composable
fun MenuItemPreview(){
    FirstMenuItem()
}
