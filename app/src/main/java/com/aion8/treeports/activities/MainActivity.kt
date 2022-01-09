package com.aion8.treeports.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.aion8.treeports.navigation.main.MainNavGraph
import com.aion8.treeports.ui.theme.TreePortsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TreePortsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    MainAppEntry()
                }
            }
        }
    }
}

@Composable
fun MainAppEntry() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) {
        val navController = rememberNavController()
        SetupMainNavGraph(navController = navController)
    }
}

@Composable
fun SetupMainNavGraph(
    navController: NavHostController
){
    MainNavGraph(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TreePortsTheme {
        MainAppEntry()
    }
}