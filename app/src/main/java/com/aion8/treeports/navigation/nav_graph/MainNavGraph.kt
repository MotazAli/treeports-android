package com.aion8.treeports.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aion8.treeports.navigation.MAIN_ROUTE
import com.aion8.treeports.navigation.MainScreens
import com.aion8.treeports.screens.HistoryScreen
import com.aion8.treeports.screens.HomeScreen
import com.aion8.treeports.screens.main.HelpScreen
import com.aion8.treeports.screens.main.ProfileScreen
import com.aion8.treeports.screens.main.SettingsScreen


fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController
){

    navigation(
        startDestination = MainScreens.Home.route,
        route = MAIN_ROUTE
    ){

        composable(route = MainScreens.Home.route){
            HomeScreen(navController = navController)
        }

        composable(route = MainScreens.History.route){
            HistoryScreen(navController = navController)
        }

        composable(route= MainScreens.Profile.route){
            ProfileScreen(navController = navController)
        }

        composable(route = MainScreens.Help.route){
            HelpScreen(navController = navController)
        }

        composable(route = MainScreens.Settings.route){
            SettingsScreen(navController = navController)
        }

    }
}