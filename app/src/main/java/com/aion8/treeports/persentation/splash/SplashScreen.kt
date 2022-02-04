package com.aion8.treeports.persentation.splash

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.aion8.treeports.R
import com.aion8.treeports.activities.AuthActivity
import com.aion8.treeports.activities.SplashActivity
import com.aion8.treeports.navigation.splash.SplashScreens
import com.google.accompanist.pager.ExperimentalPagerApi
import kotlinx.coroutines.delay

@ExperimentalPagerApi
@Composable
fun SplashScreen(
    navController: NavHostController
){

    //val context  = LocalContext.current
    val activity  = (LocalContext.current as? SplashActivity)
    LaunchedEffect(key1 = true){
        delay(5000)

        navController.popBackStack()
        navController.navigate(route = SplashScreens.WelcomeOnboarding.route)

//        activity?.let {
//            Intent(it , AuthActivity::class.java).apply {
//                it.startActivity(this)
//                it.finish()
//            }
//        }

    }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green),
        contentAlignment = Alignment.Center,
    ){
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "app_logo"
        )
    }
}


@ExperimentalPagerApi
@Composable
@Preview
fun SplashScreenPreview(){
    SplashScreen(
        navController = rememberNavController()
    )
}