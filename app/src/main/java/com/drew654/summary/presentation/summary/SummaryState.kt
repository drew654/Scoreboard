package com.drew654.summary.presentation.summary

import com.drew654.summary.domain.model.summary.Summary

data class SummaryState(
    val isLoading: Boolean = false,
    val error: String = "",
    val summary: Summary? = null
)
