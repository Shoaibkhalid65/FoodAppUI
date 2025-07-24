package com.example.foodappui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.foodappui.ui.theme.OrangeColor

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)
@Composable
@Preview(showBackground = true)
fun CatalogTopAppBar(){
    TopAppBar(
        title = {},
        navigationIcon = {
            IconButton(
                onClick = {}
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Default.KeyboardArrowLeft,
                    contentDescription = "navigation icon"
                )
            }
        },
        actions = {
            var isChecked by remember { mutableStateOf(true) }
            IconToggleButton(
                checked = isChecked,
                onCheckedChange = {
                    isChecked=it
                },
                shapes = IconButtonDefaults.toggleableShapes(),
                colors = IconButtonDefaults.iconToggleButtonColors(
                    containerColor = Color.Transparent,
                    checkedContainerColor = Color.Transparent,
                    checkedContentColor = OrangeColor,
                    contentColor = OrangeColor
                )
            ) {
                Icon(
                    imageVector = if(isChecked) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                    contentDescription = "favorite icon"
                )
            }
        }
    )
}