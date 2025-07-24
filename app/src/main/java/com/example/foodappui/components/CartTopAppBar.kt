package com.example.foodappui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.foodappui.data.Food
import com.example.foodappui.data.cartList
import com.example.foodappui.ui.theme.LightGreyColor
import com.example.foodappui.ui.theme.playfairFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CartTopAppBar(cartList: List<Food>){
    val size= cartList.size
    TopAppBar(
        title = {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Black, fontFamily = playfairFamily)){
                        append("Cart,")
                    }
                    withStyle(style = SpanStyle(color = LightGreyColor, fontFamily = FontFamily.Serif)){
                        append("$size ${if(size>0) "items" else "item"}")
                    }
                },
                fontSize = 32.sp
            )
        },
        actions = {
            if(size>0) {
                IconButton(
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "close icon"
                    )
                }
            }
        }

    )
}
@Preview(showBackground = true)
@Composable
fun CartTopBarPreview(){
    CartTopAppBar(cartList=cartList)
}