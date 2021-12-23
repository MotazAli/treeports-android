package com.aion8.treeports.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aion8.treeports.navigation.MainScreens
import com.aion8.treeports.screens.HistoryScreen
import com.aion8.treeports.screens.HomeScreen


fun NavGraphBuilder.mainNavGraph(
    navController: NavHostController
){

    navigation(
        startDestination = MainScreens.Home.route,
        route = "home_route"
    ){

        composable(route = MainScreens.Home.route){
            HomeScreen(navController = navController)
        }

        composable(route = MainScreens.History.route){
            HistoryScreen(navController = navController)
        }

    }
}