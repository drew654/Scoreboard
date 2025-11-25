package com.drew654.scoreboard.presentation.scoreboard

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.drew654.scoreboard.common.Constants
import com.drew654.scoreboard.common.Resource
import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.domain.model.scoreboard.ListCalendarEntry
import com.drew654.scoreboard.domain.use_case.get_scoreboard.GetScoreboardUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import java.time.LocalDate
import java.time.ZoneId
import javax.inject.Inject

@HiltViewModel
class ScoreboardViewModel @Inject constructor(
    private val getScoreboardUseCase: GetScoreboardUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private var initialized = false
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

    private val statusSortOrder = mapOf(
        "STATUS_IN_PROGRESS" to 1,
        "STATUS_END_PERIOD" to 1,
        "STATUS_HALFTIME" to 1,
        "STATUS_FINAL" to 2,
        "STATUS_SCHEDULED" to 3
    )

    fun loadScoreboard(sport: String, league: String) {
        if (!initialized || currentSport != sport || currentLeague != league) {
            initialized = true
            currentSport = sport
            currentLeague = league
            getScoreboard(sport, league)
        }
    }

    private fun getScoreboard(
        sport: String,
        league: String,
        week: Int? = null,
        seasonType: Int? = null
    ) {
        getScoreboardUseCase(sport, league, week, seasonType).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    val scoreboard = result.data
                    val competitions =
                        scoreboard?.events?.flatMap { it.competitions } ?: emptyList()
                    val sortedCompetitions = competitions.sortedWith(
                        compareByDescending<Competition> {
                            val competitionDate = it.date
                                .atZone(ZoneId.systemDefault())
                                .toLocalDate()
                            competitionDate == LocalDate.now(ZoneId.systemDefault())
                        }.thenBy { competition ->
                            statusSortOrder[competition.status.type.name] ?: Int.MAX_VALUE
                        }.thenBy { it.date }
                    )
                    val calendarEntries =
                        scoreboard?.leagues?.find { it.id == 23 }?.calendar?.flatMap { it.entries }
                            ?: emptyList()

                    _state.value = ScoreboardState(
                        isLoading = false,
                        scoreboard = scoreboard,
                        competitions = sortedCompetitions,
                        calendarEntries = if (week == null || seasonType == null) calendarEntries else state.value.calendarEntries
                    )

                    if (week == null || seasonType == null) {
                        setInitialCalendarEntry(calendarEntries, week, seasonType)
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

    fun refresh() {
        val week = selectedCalendarEntry.value?.value
        currentLeague?.let { league ->
            currentSport?.let { sport ->
                getScoreboard(sport, league, week)
            }
        }
    }

    private fun setInitialCalendarEntry(
        calendarEntries: List<ListCalendarEntry>,
        week: Int?,
        seasonType: Int?
    ) {
        val now = System.currentTimeMillis()
        val currentWeekEntry =
            if (week == null) calendarEntries.find { now in it.startDate.toEpochMilli()..it.endDate.toEpochMilli() }
            else calendarEntries.find { it.value == week && if (seasonType == null) true else it.calendarValue == seasonType }

        setSelectedCalendarEntry(currentWeekEntry ?: calendarEntries.first())
    }

    private val _selectedCalendarEntry = MutableStateFlow<ListCalendarEntry?>(null)
    val selectedCalendarEntry = _selectedCalendarEntry.asStateFlow()

    fun setSelectedCalendarEntry(entry: ListCalendarEntry) {
        if (_selectedCalendarEntry.value == entry) return

        _selectedCalendarEntry.value = entry

        currentLeague?.let { league ->
            currentSport?.let { sport ->
                getScoreboard(sport, league, entry.value, entry.calendarValue)
            }
        }
    }
}
