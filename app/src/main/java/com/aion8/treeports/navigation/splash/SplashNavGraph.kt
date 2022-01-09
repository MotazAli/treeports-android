package com.aion8.treeports.navigation.splash

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aion8.treeports.persentation.splash.SplashScreen

@Composable
fun SplashNavGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController ,
        startDestination = SplashScreens.Splash.route
    ){
        composable(route = SplashScreens.Splash.route){
            SplashScreen(navController = navController)
        }
    }
}