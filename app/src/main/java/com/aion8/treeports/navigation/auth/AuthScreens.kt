package com.aion8.treeports.navigation.auth


val AUTH_ROUTE = "authentication"

sealed class AuthScreens( val route:String ) {
    object Login: AuthScreens("Login")
    object ForgotPassword: AuthScreens("ForgotPassword")
    object SignUp: AuthScreens("SignUp")
}