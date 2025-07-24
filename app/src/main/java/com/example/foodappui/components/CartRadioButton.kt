package com.example.foodappui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodappui.ui.theme.LightGreyColor
import com.example.foodappui.ui.theme.OrangeColor
import com.example.foodappui.ui.theme.WhiteColor

@Composable
fun CartRadioButton(text1:String,text2: String,isSelected: Boolean,onClick:()-> Unit){
    Row (
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp)
            .fillMaxWidth()
            .clickable{
               onClick()
            },
        verticalAlignment = Alignment.CenterVertically,
    ){
        Text(
            text = text1,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = text2,
            modifier = Modifier.padding(horizontal = 16.dp),
            fontWeight = FontWeight.Medium
        )
        Spacer(modifier = Modifier.weight(1f))
        RadioButton(
            selected = isSelected,
            onClick={
                onClick()
            },
            colors = RadioButtonDefaults.colors(
                selectedColor = OrangeColor,
                unselectedColor = LightGreyColor
            )
        )
    }
    HorizontalDivider(thickness = 1.dp, color = WhiteColor)
}

@Preview(showBackground = true)
@Composable
fun CartRadioButtonPreview(){
    CartRadioButton(text1 = "Standard delivery,40-60 minutes", text2 = "Free", isSelected = true, onClick = {})
}