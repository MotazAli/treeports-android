package com.aion8.treeports.navigation

sealed class AuthScreens( val route:String ) {
    object Login: AuthScreens("Login")
    object ForgotPassword: AuthScreens("ForgotPassword")
    object SignUp: AuthScreens("SignUp")
}