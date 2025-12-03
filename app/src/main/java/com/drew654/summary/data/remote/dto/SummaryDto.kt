package com.drew654.summary.data.remote.dto

import com.drew654.summary.domain.model.summary.Summary

data class SummaryDto(
    val drives: DrivesDto
)

fun SummaryDto.toSummary(): Summary {
    return Summary(
        drives = drives.toDrives()
    )
}
