package com.aion8.treeports.navigation


val MAIN_ROUTE = "Main"


sealed class MainScreens( val route:String ) {
    object Home: MainScreens("Home")
    object History: MainScreens("History")
    object Profile: MainScreens("Profile")
    object Help: MainScreens("Help")
    object Settings: MainScreens("Settings")
}