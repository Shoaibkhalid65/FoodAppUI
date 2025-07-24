package com.example.foodappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.foodappui.components.CartTopAppBar
import com.example.foodappui.components.CatalogTopAppBar
import com.example.foodappui.components.HomeTopAppBar
import com.example.foodappui.components.MainBottomBar
import com.example.foodappui.components.ProfileTopAppBar
import com.example.foodappui.data.cartList
import com.example.foodappui.navigation.Navigation
import com.example.foodappui.navigation.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainUI()
        }
    }
}
@Composable
fun MainUI(){
    val navController= rememberNavController()
    val navBackSlackEntry by navController.currentBackStackEntryAsState()
    val showBottomBar = navBackSlackEntry?.destination?.route in listOf(
        Screen.HomeScreen.route,
        Screen.CatalogScreen.route,
        Screen.CartScreen.route,
        Screen.ProfileScreen.route
    )
    val currentRoute = navBackSlackEntry?.destination?.route
    Scaffold(
        topBar = {
            when(currentRoute){
                Screen.HomeScreen.route -> HomeTopAppBar()
                Screen.CartScreen.route -> CartTopAppBar(cartList = cartList)
                Screen.CatalogScreen.route -> CatalogTopAppBar()
                Screen.ProfileScreen.route -> ProfileTopAppBar()
            }
        },
        bottomBar = {
            if(showBottomBar){
                MainBottomBar(navController=navController)
            }
        }
    ) {innerPadding->
        Surface(modifier = Modifier.padding(innerPadding)) {
            Navigation(navController=navController)
        }
    }
}

