package com.aion8.treeports.navigation.splash

import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aion8.treeports.activities.AuthActivity
import com.aion8.treeports.activities.SplashActivity
import com.aion8.treeports.persentation.splash.SplashScreen
import com.aion8.treeports.persentation.splash.WelcomeBoardingScreen
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun SplashNavGraph(
    navController: NavHostController
){
    val activity  = (LocalContext.current as? SplashActivity)
    NavHost(
        navController = navController ,
        startDestination = SplashScreens.Splash.route
    ){
        composable(route = SplashScreens.Splash.route){
            SplashScreen(navController = navController)
        }

        composable(route = SplashScreens.WelcomeOnboarding.route){
            WelcomeBoardingScreen( onFinishButtonClick = {
                activity?.let {
                    Intent(it, AuthActivity::class.java).apply {
                        it.startActivity(this)
                        it.finish()
                    }
                }
            })
        }
    }
}