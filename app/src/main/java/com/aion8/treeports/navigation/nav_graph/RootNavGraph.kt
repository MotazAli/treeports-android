package com.aion8.treeports.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.aion8.treeports.navigation.AuthScreens


@Composable
fun RootNavGraph(
    navController : NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = AuthScreens.Login.route  ,
        route = "Root_route"
    ){

        mainNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }

}