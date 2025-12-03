package com.drew654.summary.presentation.summary

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.drew654.scoreboard.common.Resource
import com.drew654.summary.domain.use_case.GetSummaryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class SummaryViewModel @Inject constructor(
    private val getSummaryUseCase: GetSummaryUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state = mutableStateOf(SummaryState())
    val state: State<SummaryState> = _state

    init {
        savedStateHandle.get<String>("competitionId")?.let { competitionId ->
            getSummary(competitionId.toInt())
        }
    }

    private fun getSummary(
        event: Int
    ) {
        getSummaryUseCase(event).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    val summary = result.data

                    _state.value = SummaryState(
                        isLoading = false,
                        summary = summary
                    )
                }

                is Resource.Error -> {
                    _state.value = SummaryState(
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
}
