package com.example.foodappui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.foodappui.R
import com.example.foodappui.components.CartColumnLayout
import com.example.foodappui.components.CartRadioButton
import com.example.foodappui.components.CustomOrangeButton
import com.example.foodappui.ui.theme.LightGreyColor
import com.example.foodappui.ui.theme.OrangeColor

@Composable
fun CartScreen(navController: NavController){
    Column(
        modifier = Modifier.padding()
    ) {
        var isSelected by remember { mutableStateOf(false) }
        CartRadioButton(text1 = "Standard delivery,40-60 minutes", text2 = "Free", isSelected = isSelected) {
            isSelected=!isSelected
        }
        CartRadioButton(
            text1 = "Express, 15-25 minutes ${stringResource(R.string.fast_emoji)}",
            text2 = "$2.00",
            isSelected=!isSelected
        ) {
            isSelected=!isSelected
        }
        Spacer(modifier = Modifier.height(10.dp))
        CartColumnLayout()
        Row (
            modifier = Modifier.padding(horizontal = 30.dp, vertical = 10.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Promocode",
                color = LightGreyColor,
                fontSize = 14.sp
            )
            Spacer(
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "TASTE2025",
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(horizontal = 5.dp),
                fontSize = 15.sp
            )
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = "check icon",
                tint = OrangeColor,
                modifier = Modifier.size(18.dp)
            )
        }
        CustomOrangeButton(
            text1 = "$11,70",
            text2 = "Confirm order"
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CartScreenPreview(){

}
