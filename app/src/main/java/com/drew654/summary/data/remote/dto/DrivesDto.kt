package com.drew654.summary.data.remote.dto

import com.drew654.summary.domain.model.summary.Drives

data class DrivesDto(
    val current: CurrentDriveDto,
    val previous: List<DriveDto>
)

fun DrivesDto.toDrives(): Drives {
    return Drives(
        current = current.toCurrentDrive(),
        previous = previous.map { it.toDrive() }
    )
}
