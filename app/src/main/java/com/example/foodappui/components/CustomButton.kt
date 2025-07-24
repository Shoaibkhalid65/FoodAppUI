package com.example.foodappui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.ui.theme.OrangeColor

@Composable
fun CustomOrangeButton(text1: String,text2: String,modifier: Modifier= Modifier){
    Button(
        modifier = modifier.padding(horizontal = 20.dp).fillMaxWidth().height(55.dp),
        onClick = {},
        shape = RoundedCornerShape(4.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = OrangeColor
        )
    ) {
        Text(
            text = text1,
            fontFamily = FontFamily.Serif,
            fontSize = 16.sp,
            color = Color.White
        )
        Box(
            modifier = Modifier.fillMaxHeight()
        ){
            VerticalDivider(
                modifier = Modifier.padding(horizontal = 10.dp).height(20.dp).align(Alignment.Center),
                thickness = 1.dp,
                color = Color.White
            )
        }
        Text(
            text = text2,
            fontSize = 14.sp,
            color = Color.White
        )
    }
}