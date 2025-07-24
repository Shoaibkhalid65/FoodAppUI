package com.example.foodappui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.Person3
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodappui.data.Profile
import com.example.foodappui.ui.theme.LightBackground
import com.example.foodappui.ui.theme.OrangeColor
import com.example.foodappui.ui.theme.playfairFamily

@Composable
fun ProfileItem(profile: Profile){
    Row (
        modifier = Modifier.padding(horizontal = 30.dp, vertical = 15.dp).fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            imageVector =profile.vector,
            contentDescription = profile.label
        )
        Text(
            text = profile.label,
            modifier = Modifier.widthIn(120.dp).padding(horizontal = 15.dp),
            fontFamily = playfairFamily
        )
        Spacer(modifier = Modifier.weight(1f))
        if(profile.hasBadge){
            Box(
                modifier = Modifier
                    .background(OrangeColor, RoundedCornerShape(24.dp))
            ) {
                Text(
                    text = "1200 Points",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp).align(alignment = Alignment.Center),
                    color = Color.White
                )
            }
        }
        Icon(
            imageVector = Icons.AutoMirrored.Default.KeyboardArrowRight,
            contentDescription = null
        )
    }
}
@Composable
@Preview(showBackground = true)
fun ProfileItemPreview(){
    ProfileItem(
        Profile(
            vector = Icons.Outlined.Person3,
            label = "Membership",
            hasBadge = true
        )
    )
}
@Composable
@Preview(showBackground = true)
fun ProfileItemPreview1(){
    ProfileItem(
        Profile(
            vector = Icons.Outlined.CreditCard,
            label = "Payment Method"
        ),
    )
}