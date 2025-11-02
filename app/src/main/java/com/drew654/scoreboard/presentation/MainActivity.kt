package com.drew654.scoreboard.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.drew654.scoreboard.presentation.competition.CompetitionScreen
import com.drew654.scoreboard.presentation.scoreboard.ScoreboardScreen
import com.drew654.scoreboard.presentation.scoreboard.ScoreboardViewModel
import com.drew654.scoreboard.presentation.ui.theme.ScoreboardTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            ScoreboardTheme {
                Scaffold { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = ScoreboardFeature.ROUTE,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        navigation(
                            startDestination = "${Screen.Scoreboard.route}/football/college-football",
                            route = ScoreboardFeature.ROUTE
                        ) {
                            composable(
                                route = "${Screen.Scoreboard.route}/{sport}/{league}"
                            ) { backStackEntry ->
                                val parentEntry = remember(backStackEntry) {
                                    navController.getBackStackEntry(ScoreboardFeature.ROUTE)
                                }
                                val viewModel = hiltViewModel<ScoreboardViewModel>(parentEntry)
                                val sport = backStackEntry.arguments?.getString("sport")!!
                                val league = backStackEntry.arguments?.getString("league")!!
                                LaunchedEffect(Unit) {
                                    viewModel.loadScoreboard(sport, league)
                                }
                                ScoreboardScreen(
                                    viewModel = viewModel,
                                    navController = navController
                                )
                            }
                            composable(
                                route = "${Screen.Competition.route}/{competitionId}"
                            ) { backStackEntry ->
                                val parentEntry = remember(backStackEntry) {
                                    navController.getBackStackEntry(ScoreboardFeature.ROUTE)
                                }
                                val viewModel = hiltViewModel<ScoreboardViewModel>(parentEntry)
                                CompetitionScreen(
                                    viewModel = viewModel,
                                    competitionId = backStackEntry.arguments?.getString("competitionId")!!
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
