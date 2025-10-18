package com.drew654.scoreboard.domain.model.scoreboard

data class Record(
    val name: String,
    val abbreviation: String? = null,
    val type: RecordType,
    val summary: String
)
