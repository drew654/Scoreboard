package com.drew654.summary.domain.model.summary

data class CurrentDrive(
    val description: String,
    val id: String,
    val isScore: Boolean,
    val offensivePlays: Int,
    val plays: List<Play>
)
