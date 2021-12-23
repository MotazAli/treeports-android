package com.aion8.treeports.navigation

sealed class MainScreens( val route:String ) {
    object Home: MainScreens("Home")
    object History: MainScreens("History")
    object Profile: MainScreens("Profile")
    object Help: MainScreens("Help")
    object Settings: MainScreens("Settings")
}