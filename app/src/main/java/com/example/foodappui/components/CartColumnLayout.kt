package com.example.foodappui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodappui.data.cartList

@Composable
fun CartColumnLayout(){
    LazyColumn (
        modifier = Modifier.height(400.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        items(cartList){food->
            CartItem(food = food)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun CartColumnLayoutPreview(){
    CartColumnLayout()
}