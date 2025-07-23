package com.example.foodappui.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodappui.R
import com.example.foodappui.data.BottomBarItem
import com.example.foodappui.ui.theme.OrangeColor

@Composable
@Preview(showBackground = true)
fun MainBottomBar(){
    var selectedIndex by remember { mutableIntStateOf(0) }
    NavigationBar {
        BottomBarItem.entries.forEachIndexed { index, item ->
            val isSelected = selectedIndex==index
            NavigationBarItem(
                selected = isSelected,
                onClick = {
                    selectedIndex=index
                },
                icon = {
                    Icon(
                        painter = painterResource(item.imageResourceId),
                        contentDescription = item.name,
                        modifier = Modifier.size(24.dp)
                    )
                },
                label = {
                    Text(
                        text = item.label
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = OrangeColor,
                    selectedTextColor = OrangeColor,
                    indicatorColor = Color.Transparent,
                    unselectedTextColor = Color.Black,
                    unselectedIconColor = Color.Black
                )
            )
        }
    }
}