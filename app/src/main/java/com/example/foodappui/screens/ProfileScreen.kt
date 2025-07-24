package com.example.foodappui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PhotoCamera
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.foodappui.R
import com.example.foodappui.components.ProfileItem
import com.example.foodappui.data.profileItemList
import com.example.foodappui.ui.theme.LightGreyColor
import com.example.foodappui.ui.theme.OrangeColor

@Composable
fun ProfileScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Box(
            modifier = Modifier.size(100.dp)
        ){
            Image(
                painter = painterResource(R.drawable.cartoon),
                contentDescription = null,
                modifier = Modifier.size(84.dp).clip(CircleShape).align(Alignment.Center),
                contentScale = ContentScale.Crop
            )
            IconButton(
                onClick = {},
                modifier = Modifier.padding(bottom = 22.dp, end = 1.dp).size(24.dp).align(Alignment.BottomEnd),
                colors = IconButtonDefaults.iconButtonColors(
                    contentColor = Color.White,
                    containerColor = OrangeColor
                )
            ) {
                Icon(
                    imageVector = Icons.Default.PhotoCamera,
                    contentDescription = null,
                    modifier = Modifier.size(12.dp),
                )
            }
        }
        Text(
            text = "Woade Spicy",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 19.sp
        )
        Text(
            text = "woade@example.com",
            color = LightGreyColor,
            fontSize = 13.sp,
            modifier = Modifier.padding(vertical = 12.dp)
        )
        Row (
            modifier = Modifier.padding(horizontal = 40.dp, vertical = 30.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            CustomText(
                upperText = "12",
                lowerText = "Coupon"
            )
            CustomText(
                upperText = "1200",
                lowerText = "Points"
            )
            CustomText(
                upperText = "24",
                lowerText = "Order"
            )
        }
        profileItemList.forEach { profileItem->
            ProfileItem(profile = profileItem)
        }


    }
}
@Composable
fun CustomText(upperText: String,lowerText: String){
    Column(
        modifier = Modifier.wrapContentSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = upperText,
            color = Color.Black,
            fontWeight = FontWeight.SemiBold,
            fontSize = 17.sp
        )
        Text(
            text = lowerText,
            color = LightGreyColor,
            modifier = Modifier.padding(3.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun ProfileScreenPreview(){
    ProfileScreen(navController = rememberNavController())
}