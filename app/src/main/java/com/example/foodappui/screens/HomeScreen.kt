package com.example.foodappui.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodappui.components.FoodRowLayout
import com.example.foodappui.components.MainBottomBar
import com.example.foodappui.components.MainTopAppbar
import com.example.foodappui.components.MenuGridLayout
import com.example.foodappui.components.RestaurantRowLayout


@Composable
@Preview(showBackground = true)
fun HomeScreen() {
    Scaffold(
        topBar = {
            MainTopAppbar()
        },
        bottomBar = {
            MainBottomBar()
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier.padding(innerPadding),
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
}
