package com.example.foodappui.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.R
import com.example.foodappui.data.Food
import com.example.foodappui.ui.theme.playfairFamily


@OptIn(ExperimentalMaterial3ExpressiveApi::class)
@Composable
fun CatalogItem(food: Food){
    Column (
        modifier = Modifier
    ){
        val bitmap: ImageBitmap= ImageBitmap.imageResource(food.imageResourceId)
        val backgroundColor = averageColor(bitmap)
        Box(
            modifier = Modifier
                .aspectRatio(1f)
                .fillMaxWidth()
                .background(color = backgroundColor.copy(0.3f))
        ){
            Image(
                painter = painterResource(food.imageResourceId),
                contentDescription = "food image",
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .fillMaxHeight(0.9f)
                    .align(alignment = Alignment.Center),
                contentScale = ContentScale.Fit
            )
            TextButton(
                onClick = {},
                modifier = Modifier
                    .padding(16.dp)
                    .heightIn(ButtonDefaults.ExtraSmallContainerHeight)
                    .align(alignment = Alignment.BottomEnd),
                colors = ButtonDefaults.textButtonColors(
                    containerColor = backgroundColor.copy(0.4f),
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = "${food.calories} kcal"
                )
            }
        }
        Text(
            text =
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Black, fontFamily = playfairFamily)){
                        append("${food.name}, ")
                    }
                    withStyle(style = SpanStyle(color = Color.LightGray, fontFamily = FontFamily.Serif )){
                        append(food.quantity)
                    }
                }
            ,
            fontSize = 32.sp,
            modifier = Modifier.padding(20.dp)
        )
        Text(
            text = "Ingredients: ${food.ingredients}",
            fontSize = 14.sp,
            modifier = Modifier.padding(horizontal = 20.dp)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun CatalogItemPreview(){
    CatalogItem(
        food = Food(
            id = 6,
            name = "Caramel Shake",
            imageResourceId = R.drawable.mix_shake,
            quantity = "250 ml",
            detailedName = "Salted Caramel Cream Shake",
            price = 7.50f,
            ingredients = "Milk, caramel syrup, white sugar, whipped cream, vanilla extract, salt, dark chocolate, cream, butter, flour, eggs, water, cocoa powder, chocolate chips, brown sugar, milk powder.",
            calories = 470
        ),
    )
}