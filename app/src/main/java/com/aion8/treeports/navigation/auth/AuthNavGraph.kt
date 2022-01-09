package com.aion8.treeports.navigation.auth

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aion8.treeports.navigation.auth.AuthScreens
import com.aion8.treeports.persentation.auth.ForgotPasswordScreen
import com.aion8.treeports.persentation.auth.LoginScreen
import com.aion8.treeports.persentation.auth.SignUpScreen

@Composable
fun AuthNavGraph(
    navController: NavHostController
){

    NavHost(
        navController = navController,
        startDestination = AuthScreens.Login.route
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




//fun NavGraphBuilder.authNavGraph(
//    navController: NavHostController
//){
//    navigation(
//        startDestination = AuthScreens.Login.route,
//        route = AUTH_ROUTE
//    ){
//
//        composable(route = AuthScreens.Login.route){
//            LoginScreen(navController = navController)
//        }
//
//        composable( route= AuthScreens.SignUp.route){
//            SignUpScreen(navController = navController)
//        }
//
//        composable(route= AuthScreens.ForgotPassword.route){
//            ForgotPasswordScreen(navController = navController)
//        }
//
//    }
//}