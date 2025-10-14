package com.drew654.scoreboard.data.remote.dto


import com.drew654.scoreboard.domain.model.scoreboard.Record
import com.drew654.scoreboard.domain.model.scoreboard.RecordType
import com.drew654.scoreboard.domain.model.scoreboard.RecordTypeTypeAdapter
import com.google.gson.annotations.JsonAdapter

data class RecordDto(
    val name: String,
    val abbreviation: String,
    @JsonAdapter(RecordTypeTypeAdapter::class)
    val type: RecordType,
    val summary: String
)

fun RecordDto.toRecord(): Record {
    return Record(name = name, abbreviation = abbreviation, type = type, summary = summary)
}
