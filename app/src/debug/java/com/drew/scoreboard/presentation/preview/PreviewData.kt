package com.drew.scoreboard.presentation.preview

import com.drew654.scoreboard.domain.model.scoreboard.Competition
import com.drew654.scoreboard.domain.model.scoreboard.Competitor
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway
import com.drew654.scoreboard.domain.model.scoreboard.Linescore
import com.drew654.scoreboard.domain.model.scoreboard.Record
import com.drew654.scoreboard.domain.model.scoreboard.RecordType
import com.drew654.scoreboard.domain.model.scoreboard.Status
import com.drew654.scoreboard.domain.model.scoreboard.StatusType
import com.drew654.scoreboard.domain.model.scoreboard.Team
import java.time.Instant
import java.time.format.DateTimeFormatter

object PreviewData {
    val formatter: DateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME

    val sampleFinalCompetition = Competition(
        id = 401752748,
        competitors = listOf(
            Competitor(
                id = 99,
                homeAway = HomeAway.HOME,
                team = Team(
                    abbreviation = "LSU",
                    displayName = "LSU Tigers",
                    id = 99,
                    location = "LSU",
                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/99.png",
                    name = "Tigers",
                    shortDisplayName = "LSU"
                ),
                score = 25,
                linescores = listOf(
                    Linescore(
                        value = 7,
                        displayValue = "7",
                        period = 1
                    ),
                    Linescore(
                        value = 11,
                        displayValue = "11",
                        period = 2
                    ),
                    Linescore(
                        value = 0,
                        displayValue = "0",
                        period = 3
                    ),
                    Linescore(
                        value = 7,
                        displayValue = "7",
                        period = 4
                    )
                ),
                records = listOf(
                    Record(
                        name = "overall",
                        abbreviation = "Game",
                        type = RecordType.OVERALL,
                        summary = "5-3"
                    ),
                    Record(
                        name = "Home",
                        abbreviation = null,
                        type = RecordType.HOME,
                        summary = "4-1"
                    ),
                    Record(
                        name = "Road",
                        abbreviation = null,
                        type = RecordType.AWAY,
                        summary = "1-2"
                    ),
                    Record(
                        name = "vs. Conf.",
                        abbreviation = null,
                        type = RecordType.CONF,
                        summary = "2-3"
                    )
                )
            ),
            Competitor(
                id = 245,
                homeAway = HomeAway.AWAY,
                team = Team(
                    abbreviation = "TA&M",
                    displayName = "Texas A&M Aggies",
                    id = 245,
                    location = "Texas A&M",
                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/245.png",
                    name = "Aggies",
                    shortDisplayName = "Texas A&M"
                ),
                score = 49,
                linescores = listOf(
                    Linescore(
                        value = 14,
                        displayValue = "14",
                        period = 1
                    ),
                    Linescore(
                        value = 0,
                        displayValue = "0",
                        period = 2
                    ),
                    Linescore(
                        value = 21,
                        displayValue = "21",
                        period = 3
                    ),
                    Linescore(
                        value = 14,
                        displayValue = "14",
                        period = 4
                    )
                ),
                records = listOf(
                    Record(
                        name = "overall",
                        abbreviation = "Game",
                        type = RecordType.OVERALL,
                        summary = "8-0"
                    ),
                    Record(
                        name = "Home",
                        abbreviation = null,
                        type = RecordType.HOME,
                        summary = "5-0"
                    ),
                    Record(
                        name = "Road",
                        abbreviation = null,
                        type = RecordType.AWAY,
                        summary = "3-0"
                    ),
                    Record(
                        name = "vs. Conf.",
                        abbreviation = null,
                        type = RecordType.CONF,
                        summary = "5-0"
                    )
                )
            )
        ),
        date = Instant.from(formatter.parse("2025-10-25T23:30:00Z")),
        status = Status(
            clock = 0,
            displayClock = "0:00",
            period = 4,
            type = StatusType(
                completed = true,
                description = "Final",
                detail = "Final",
                id = 3,
                name = "STATUS_FINAL",
                shortDetail = "Final",
                state = "post"
            )
        )
    )

    val sampleInProgressCompetition = Competition(
        id = 401752763,
        competitors = listOf(
            Competitor(
                id = 142,
                homeAway = HomeAway.HOME,
                team = Team(
                    id = 142,
                    location = "Missouri",
                    name = "Tigers",
                    abbreviation = "MIZ",
                    displayName = "Missouri Tigers",
                    shortDisplayName = "Missouri",
                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/142.png"
                ),
                score = 0,
                linescores = listOf(
                    Linescore(
                        value = 0,
                        displayValue = "0",
                        period = 1
                    )
                ),
                records = listOf(
                    Record(
                        name = "overall",
                        abbreviation = "overall",
                        type = RecordType.OVERALL,
                        summary = "6-2"
                    ),
                    Record(
                        name = "Home",
                        abbreviation = "Home",
                        type = RecordType.HOME,
                        summary = "5-1"
                    ),
                    Record(
                        name = "Away",
                        abbreviation = "Away",
                        type = RecordType.AWAY,
                        summary = "1-1"
                    ),
                    Record(
                        name = "vs. Conf.",
                        abbreviation = "CONF",
                        type = RecordType.CONF,
                        summary = "2-2"
                    )
                )
            ),
            Competitor(
                id = 245,
                homeAway = HomeAway.AWAY,
                team = Team(
                    id = 245,
                    location = "Texas A&M",
                    name = "Aggies",
                    abbreviation = "TA&M",
                    displayName = "Texas A&M Aggies",
                    shortDisplayName = "Texas A&M",
                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/245.png"
                ),
                score = 7,
                linescores = listOf(
                    Linescore(
                        value = 7,
                        displayValue = "7",
                        period = 1
                    )
                ),
                records = listOf(
                    Record(
                        name = "overall",
                        abbreviation = "overall",
                        type = RecordType.OVERALL,
                        summary = "8-0"
                    ),
                    Record(
                        name = "Home",
                        abbreviation = "Home",
                        type = RecordType.HOME,
                        summary = "5-0"
                    ),
                    Record(
                        name = "Away",
                        abbreviation = "Away",
                        type = RecordType.AWAY,
                        summary = "3-0"
                    ),
                    Record(
                        name = "vs. Conf.",
                        abbreviation = "CONF",
                        type = RecordType.CONF,
                        summary = "5-0"
                    )
                )
            )
        ),
        date = Instant.from(formatter.parse("2025-11-08T20:30:00Z")),
        status = Status(
            clock = 0,
            displayClock = "0:00",
            period = 1,
            type = StatusType(
                id = 22,
                name = "STATUS_END_PERIOD",
                state = "in",
                completed = false,
                description = "End of Period",
                detail = "End of 1st Quarter",
                shortDetail = "End of 1st"
            )
        )
    )
}
