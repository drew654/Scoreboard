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
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class ScoreboardViewModel @Inject constructor(
    private val getScoreboardUseCase: GetScoreboardUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state = mutableStateOf(ScoreboardState())
    val state: State<ScoreboardState> = _state

    private var currentLeague: String? = null
    private var currentSport: String? = null

    init {
        savedStateHandle.get<String>(Constants.PARAM_LEAGUE)?.let { league ->
            currentLeague = league
            savedStateHandle.get<String>(Constants.PARAM_SPORT)?.let { sport ->
                currentSport = sport
                getScoreboard(sport, league, null)
            }
        }
    }

    private fun getScoreboard(sport: String, league: String, week: Int?) {
        getScoreboardUseCase(sport, league, week).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    val scoreboard = result.data
                    val competitions =
                        scoreboard?.events?.flatMap { it.competitions } ?: emptyList()
                    val calendarEntries =
                        scoreboard?.leagues?.find { it.id == 23 }?.calendar?.find { it.value == 2 }?.entries
                            ?: emptyList()

                    _state.value = ScoreboardState(
                        isLoading = false,
                        scoreboard = scoreboard,
                        competitions = competitions,
                        calendarEntries = if (week == null) calendarEntries else state.value.calendarEntries
                    )

                    if (week == null) {
                        setInitialCalendarEntry(calendarEntries, week)
                    }
                }

                is Resource.Error -> {
                    _state.value = ScoreboardState(
                        isLoading = false,
                        error = result.message ?: "An unexpected error occurred"
                    )
                }

                is Resource.Loading -> {
                    _state.value = state.value.copy(isLoading = true)
                }
            }

        }.launchIn(viewModelScope)
    }

    private fun setInitialCalendarEntry(calendarEntries: List<ListCalendarEntry>, week: Int?) {
        val now = System.currentTimeMillis()
        val currentWeekEntry =
            if (week == null) calendarEntries.find { now in it.startDate.toEpochMilli()..it.endDate.toEpochMilli() }
            else calendarEntries.find { it.value == week }

        setSelectedCalendarEntry(currentWeekEntry ?: calendarEntries.first())
    }

    private val _selectedCalendarEntry = MutableStateFlow<ListCalendarEntry?>(null)
    val selectedCalendarEntry = _selectedCalendarEntry.asStateFlow()

    fun setSelectedCalendarEntry(entry: ListCalendarEntry) {
        if (_selectedCalendarEntry.value == entry) return

        _selectedCalendarEntry.value = entry

        currentLeague?.let { league ->
            currentSport?.let { sport ->
                getScoreboard(sport, league, entry.value)
            }
        }
    }
}
