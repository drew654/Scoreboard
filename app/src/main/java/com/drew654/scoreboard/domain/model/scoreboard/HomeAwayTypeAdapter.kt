package com.drew654.scoreboard.domain.model.scoreboard

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter

class HomeAwayTypeAdapter : TypeAdapter<HomeAway>() {
    override fun write(out: JsonWriter, value: HomeAway?) {
        out.value(value?.value)
    }

    override fun read(input: JsonReader): HomeAway? {
        val value = input.nextString()
        return when (value?.lowercase()) {
            "home" -> HomeAway.HOME
            "away" -> HomeAway.AWAY
            else -> null
        }
    }
}
