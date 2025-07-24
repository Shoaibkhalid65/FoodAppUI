package com.example.foodappui.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.foodappui.components.FoodRowLayout
import com.example.foodappui.components.MenuGridLayout
import com.example.foodappui.components.RestaurantRowLayout


@Composable
fun HomeScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier.padding(),
        contentPadding = PaddingValues(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            MenuGridLayout()
        }
        item {
            RestaurantRowLayout()
        }
        item {
            FoodRowLayout()
        }
    }
}


