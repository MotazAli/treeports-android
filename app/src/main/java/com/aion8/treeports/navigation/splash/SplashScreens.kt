package com.aion8.treeports.navigation.splash

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.aion8.treeports.R


sealed class SplashScreens( val route: String){
    object Splash: SplashScreens("splash")
    object WelcomeOnboarding: SplashScreens("welcome_onboarding")
}

sealed class Onboarding(
    @DrawableRes
    val image: Int,
    @StringRes
    val description: Int
) {
    object FirstPage : Onboarding(
        image = R.drawable.ic_launcher_foreground,
        description = R.string.onboarding_first_page_description
    )
    object SecondPage : Onboarding(
        image = R.drawable.ic_launcher_foreground,
        description = R.string.onboarding_second_page_description
    )
    object LastPage : Onboarding(
        image = R.drawable.ic_launcher_foreground,
        description = R.string.onboarding_last_page_description
    )
}
