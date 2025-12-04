package com.drew654.summary.data.remote.dto

import com.drew654.summary.domain.model.summary.PlayType

data class PlayTypeDto(
    val abbreviation: String?,
    val id: String,
    val text: String
)

fun PlayTypeDto.toPlayType(): PlayType {
    return PlayType(
        abbreviation = abbreviation,
        id = id.toInt(),
        text = text
    )
}
