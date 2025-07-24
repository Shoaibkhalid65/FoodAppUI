package com.example.foodappui.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Logout
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Person3
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

data class Profile (
    val vector: ImageVector,
    val label: String,
    val hasBadge: Boolean=false
)
val profileItemList=listOf(
    Profile(
        vector = Icons.Outlined.Person3,
        label = "Membership",
        hasBadge = true
    ),
    Profile(
        vector = Icons.Outlined.CreditCard,
        label = "Payment Method"
    ),
    Profile(
        vector = Icons.Outlined.Notifications,
        label = "Notification"
    ),
    Profile(
        vector = Icons.Outlined.Settings,
        label = "Settings"
    ),
    Profile(
        vector = Icons.AutoMirrored.Outlined.Logout,
        label = "Logout"
    ),

)