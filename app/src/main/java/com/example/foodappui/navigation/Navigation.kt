package com.example.foodappui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.foodappui.screens.CartScreen
import com.example.foodappui.screens.CatalogScreen
import com.example.foodappui.screens.HomeScreen
import com.example.foodappui.screens.ProfileScreen

@Composable
fun Navigation(navController: NavHostController){
    NavHost(
        navController=navController,
        startDestination = Screen.HomeScreen.route,
        modifier = Modifier.fillMaxSize()
    ){
        composable(route = Screen.HomeScreen.route){
            HomeScreen(navController = navController)
        }
        composable(route= Screen.CatalogScreen.route){
            CatalogScreen(navController=navController)
        }
        composable(route= Screen.CartScreen.route){
            CartScreen(navController=navController)
        }
        composable(route= Screen.ProfileScreen.route){
            ProfileScreen(navController=navController)
        }
    }
}