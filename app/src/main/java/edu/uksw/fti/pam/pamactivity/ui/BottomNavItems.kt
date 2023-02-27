package edu.uksw.fti.pam.pamactivity.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import edu.uksw.fti.pam.pamactivity.R

sealed class BottomNavItems (
    var title: String,
    var icon: ImageVector,
    var screen_route: String
){
    object Home: BottomNavItems("Home", Icons.Default.Home, "home")
    object Profile: BottomNavItems("Profile", Icons.Default.Person, "profile")
    object Article: BottomNavItems("Article", Icons.Default.Info, "article")
}