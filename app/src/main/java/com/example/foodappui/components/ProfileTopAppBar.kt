package com.example.foodappui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.example.foodappui.ui.theme.playfairFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileTopAppBar(){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Profile",
                color = Color.Black,
                fontFamily = playfairFamily,
                fontWeight = FontWeight.Medium
            )
        },
        navigationIcon = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Default.KeyboardArrowLeft,
                    contentDescription = "navigation icon"
                )
            }
        }
    )
}