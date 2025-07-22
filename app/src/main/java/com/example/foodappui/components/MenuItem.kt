package com.example.foodappui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun FirstMenuItem(){
    Box(
        modifier = Modifier
            .aspectRatio(ratio = 1f)
            .fillMaxWidth(),

    )
}
@Composable
fun MenuItem(){

}
@Preview(showBackground = true)
@Composable
fun MenuItemPreview(){
    FirstMenuItem()
}
