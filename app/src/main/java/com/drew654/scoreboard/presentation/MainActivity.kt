package com.drew654.scoreboard.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.drew654.scoreboard.presentation.scoreboard.ScoreboardScreen
import com.drew654.scoreboard.presentation.ui.theme.ScoreboardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScoreboardTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screen.Scoreboard.route
                ) {
                    composable(
                        route = Screen.Scoreboard.route
                    ) {
                        ScoreboardScreen()
                    }
                }
            }
        }
    }
}
