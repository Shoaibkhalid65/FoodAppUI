package com.example.foodappui.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.foodappui.components.CatalogItem
import com.example.foodappui.components.CatalogRowLayout
import com.example.foodappui.components.CustomOrangeButton
import com.example.foodappui.data.foodList

@Composable
fun CatalogScreen(navController: NavController){
    var selectedIndex by remember { mutableIntStateOf(1) }


    LazyColumn {
        item {
            CatalogItem(
                food = foodList[selectedIndex-1]
            )
        }
        item {
            CatalogRowLayout{id->
                selectedIndex=id
            }
        }
        item {
            CustomOrangeButton(
                text1 = "$5,90",
                text2 = "Add to cart",
                modifier = Modifier.padding(vertical = 20.dp).fillMaxWidth()

            )
        }
    }


}