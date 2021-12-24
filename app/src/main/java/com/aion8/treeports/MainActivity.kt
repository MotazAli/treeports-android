package com.aion8.treeports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.aion8.treeports.navigation.nav_graph.RootNavGraph
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
        SetupNavGraph(navController = navController)
    }
}

@Composable
fun SetupNavGraph(
    navController: NavHostController
){
    RootNavGraph(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TreePortsTheme {
        MainAppEntry()
    }
}