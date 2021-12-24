package com.aion8.treeports.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aion8.treeports.navigation.AUTH_ROUTE
import com.aion8.treeports.navigation.AuthScreens
import com.aion8.treeports.screens.auth.ForgotPasswordScreen
import com.aion8.treeports.screens.auth.LoginScreen
import com.aion8.treeports.screens.auth.SignUpScreen


fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = AuthScreens.Login.route,
        route = AUTH_ROUTE
    ){

        composable(route = AuthScreens.Login.route){
            LoginScreen(navController = navController)
        }

        composable( route= AuthScreens.SignUp.route){
            SignUpScreen(navController = navController)
        }

        composable(route= AuthScreens.ForgotPassword.route){
            ForgotPasswordScreen(navController = navController)
        }

    }
}