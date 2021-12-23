package com.aion8.treeports.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aion8.treeports.navigation.AuthScreens
import com.aion8.treeports.screens.auth.LoginScreen


fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = AuthScreens.Login.route,
        route = "Auth_route"
    ){

        composable(route = AuthScreens.Login.route){
            LoginScreen(navController = navController)
        }

    }
}