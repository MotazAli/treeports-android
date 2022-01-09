//package com.aion8.treeports.navigation.nav_graph
//
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import com.aion8.treeports.navigation.AUTH_ROUTE
//import com.aion8.treeports.navigation.AuthScreens
//
//
//val ROOT_ROUTE = "Root"
//
//@Composable
//fun RootNavGraph(
//    navController : NavHostController
//) {
//    NavHost(
//        navController = navController,
//        startDestination = AUTH_ROUTE  ,
//        route = ROOT_ROUTE
//    ){
//
//        mainNavGraph(navController = navController)
//        authNavGraph(navController = navController)
//    }
//
//}