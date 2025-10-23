package com.drew654.scoreboard.presentation.scoreboard

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.drew654.scoreboard.common.Constants
import com.drew654.scoreboard.common.Resource
import com.drew654.scoreboard.domain.model.scoreboard.ListCalendarEntry
import com.drew654.scoreboard.domain.use_case.get_scoreboard.GetScoreboardUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@HiltViewModel
class ScoreboardViewModel @Inject constructor(
    private val getScoreboardUseCase: GetScoreboardUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state = mutableStateOf(ScoreboardState())
    val state: State<ScoreboardState> = _state

    init {
        savedStateHandle.get<String>(Constants.PARAM_LEAGUE)?.let { league ->
            savedStateHandle.get<String>(Constants.PARAM_SPORT)?.let { sport ->
                getScoreboard(sport, league)
            }
        }
    }

    private fun getScoreboard(sport: String, league: String) {
        getScoreboardUseCase(sport, league).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = ScoreboardState(scoreboard = result.data)
                }
                is Resource.Error -> {
                    _state.value = ScoreboardState(
                        error = result.message ?: "An unexpected error occurred"
                    )
                }
                is Resource.Loading -> {
                    _state.value = ScoreboardState(isLoading = true)
                }
            }

        }.launchIn(viewModelScope)
    }

    private val _selectedCalendarEntry = MutableStateFlow<ListCalendarEntry?>(null)
    val selectedCalendarEntry = _selectedCalendarEntry.asStateFlow()

    fun setSelectedCalendarEntry(entry: ListCalendarEntry) {
        _selectedCalendarEntry.value = entry
    }
}
