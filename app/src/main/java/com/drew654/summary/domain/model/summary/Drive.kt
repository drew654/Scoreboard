package com.drew654.summary.domain.model.summary

data class Drive(
    val description: String,
    val displayResult: String,
    val id: String,
    val isScore: Boolean,
    val offensivePlays: Int,
    val result: String,
    val shortDisplayResult: String,
    val yards: Int
)
