package com.drew654.scoreboard.domain.model.scoreboard

sealed class RecordType(val value: String) {
    data object OVERALL : RecordType("overall")
    data object HOME : RecordType("homerecord")
    data object AWAY : RecordType("awayrecord")
    data object CONF : RecordType("vsconf")
}
