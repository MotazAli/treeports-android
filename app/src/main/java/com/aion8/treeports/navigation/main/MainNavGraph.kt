package com.aion8.treeports.navigation.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aion8.treeports.navigation.main.MainScreens
import com.aion8.treeports.screens.HistoryScreen
import com.aion8.treeports.screens.HomeScreen
import com.aion8.treeports.persentation.main.HelpScreen
import com.aion8.treeports.persentation.main.ProfileScreen
import com.aion8.treeports.persentation.main.SettingsScreen



@Composable
fun MainNavGraph(
    navController: NavHostController
){

    NavHost(
        navController = navController,
        startDestination = MainScreens.Home.route
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

//fun NavGraphBuilder.mainNavGraph(
//    navController: NavHostController
//){
//
//    navigation(
//        startDestination = MainScreens.Home.route,
//        route = MAIN_ROUTE
//    ){
//
//        composable(route = MainScreens.Home.route){
//            HomeScreen(navController = navController)
//        }
//
//        composable(route = MainScreens.History.route){
//            HistoryScreen(navController = navController)
//        }
//
//        composable(route= MainScreens.Profile.route){
//            ProfileScreen(navController = navController)
//        }
//
//        composable(route = MainScreens.Help.route){
//            HelpScreen(navController = navController)
//        }
//
//        composable(route = MainScreens.Settings.route){
//            SettingsScreen(navController = navController)
//        }
//
//    }
//}