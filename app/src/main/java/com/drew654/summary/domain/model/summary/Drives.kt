package com.drew654.summary.domain.model.summary

data class Drives(
    val current: CurrentDrive?,
    val previous: List<Drive>
)
