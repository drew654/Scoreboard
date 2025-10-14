package com.drew654.scoreboard.domain.model.scoreboard

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter

class RecordTypeTypeAdapter : TypeAdapter<RecordType>() {
    override fun write(out: JsonWriter, value: RecordType?) {
        out.value(value?.value)
    }

    override fun read(input: JsonReader): RecordType? {
        val value = input.nextString()
        return when (value?.lowercase()) {
            "total" -> RecordType.OVERALL
            "homerecord" -> RecordType.HOME
            "awayrecord" -> RecordType.AWAY
            "vsconf" -> RecordType.CONF
            else -> null
        }
    }
}
