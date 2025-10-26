package com.drew654.scoreboard.presentation.competition

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.drew654.scoreboard.presentation.competition.components.BoxScore

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CompetitionScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            BoxScore()
        }
    }
}
