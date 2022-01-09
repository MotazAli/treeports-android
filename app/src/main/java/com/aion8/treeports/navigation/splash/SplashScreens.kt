package com.aion8.treeports.navigation.splash



sealed class SplashScreens( val route: String){
    object Splash: SplashScreens("splash")
    object Onboarding1: SplashScreens("Onboarding1")
    object Onboarding2: SplashScreens("Onboarding2")
    object Onboarding3: SplashScreens("Onboarding3")
}
