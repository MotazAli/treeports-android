package com.aion8.treeports.activities


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.aion8.treeports.navigation.splash.SplashNavGraph
import com.aion8.treeports.ui.theme.TreePortsTheme

class SplashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TreePortsTheme {
                // A surface container using the 'background' color from the theme


                SetupSplashNavGraph(rememberNavController())


//                SplashScreen(
//                    navController = rememberNavController()
//                )

            }
        }
    }
}



@Composable
fun SetupSplashNavGraph(
    navController: NavHostController
){
    SplashNavGraph(navController = navController)
}