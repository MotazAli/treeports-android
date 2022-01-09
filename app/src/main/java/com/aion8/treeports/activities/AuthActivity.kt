package com.aion8.treeports.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.aion8.treeports.navigation.auth.AuthNavGraph
import com.aion8.treeports.navigation.splash.SplashNavGraph
import com.aion8.treeports.ui.theme.TreePortsTheme

class AuthActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TreePortsTheme {
                SetupAuthNavGraph(navController = rememberNavController())
            }
        }

    }
}



@Composable
fun SetupAuthNavGraph(
    navController: NavHostController
){
    AuthNavGraph(navController = navController)
}