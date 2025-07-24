package com.example.foodappui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.R
import com.example.foodappui.data.Food
import com.example.foodappui.ui.theme.LightGreyColor
import com.example.foodappui.ui.theme.OrangeColor
import com.example.foodappui.ui.theme.playfairFamily

@Composable
fun CartItem(food: Food){
    val bitmap = ImageBitmap.imageResource(food.imageResourceId)
    val backgroundColor=averageColor(bitmap = bitmap)
    Row (
        modifier = Modifier.padding(horizontal = 20.dp).fillMaxWidth().height(120.dp),
    ){
        Box(
            modifier = Modifier
                .aspectRatio(1f)
                .fillMaxHeight()
                .background(color = backgroundColor, shape = RoundedCornerShape(12.dp))
        ){
            Image(
                painter = painterResource(food.imageResourceId),
                contentDescription = food.name,
                modifier = Modifier.size(110.dp).align(Alignment.Center),

            )
        }
        Column(
            modifier = Modifier.padding(start = 15.dp)
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Black, fontFamily = playfairFamily)){
                        append("${food.detailedName},")
                    }
                    withStyle(style = SpanStyle(color = LightGreyColor, fontFamily = FontFamily.Serif)){
                        append(food.quantity)
                    }
                },
                fontSize = 18.sp,
                modifier = Modifier.padding(vertical = 6.dp).height(72.dp),
                textAlign = TextAlign.Start
            )
            Row (
                modifier = Modifier.padding(vertical = 10.dp).fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                var quantity by remember { mutableIntStateOf(1) }
                val iconSize=16.dp
                Text(
                    text = "$${food.price}",
                    color = OrangeColor,
                    fontFamily = FontFamily.Serif,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )
                Spacer(
                    modifier = Modifier.weight(1f)
                )
                IconButton(
                    onClick = {
                        quantity--
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Remove,
                        contentDescription = "minus icon",
                        modifier = Modifier.size(iconSize)
                    )
                }
                Text(
                    text = "$quantity",
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Medium
                )
                IconButton(
                    onClick = {
                        quantity++
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "add icon",
                        modifier = Modifier.size(iconSize)
                    )
                }

            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CartItemPreview(){
    val food = Food(
        id = 6,
        name = "Caramel Shake",
        imageResourceId = R.drawable.mix_shake,
        quantity = "250 ml",
        detailedName = "Salted Caramel Cream Shake",
        price = 7.50f,
        ingredients = "Milk, caramel syrup, white sugar, whipped cream, vanilla extract, salt, dark chocolate, cream, butter, flour, eggs, water, cocoa powder, chocolate chips, brown sugar, milk powder.",
        calories = 470
    )
    CartItem(food)
}