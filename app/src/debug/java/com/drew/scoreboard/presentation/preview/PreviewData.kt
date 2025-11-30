package com.drew.scoreboard.presentation.preview

import com.drew654.scoreboard.data.remote.dto.CompetitionDto
import com.drew654.scoreboard.data.remote.dto.CompetitorDto
import com.drew654.scoreboard.data.remote.dto.EventDto
import com.drew654.scoreboard.data.remote.dto.LeagueDto
import com.drew654.scoreboard.data.remote.dto.LinescoreDto
import com.drew654.scoreboard.data.remote.dto.ListCalendarDto
import com.drew654.scoreboard.data.remote.dto.ListCalendarEntryDto
import com.drew654.scoreboard.data.remote.dto.RecordDto
import com.drew654.scoreboard.data.remote.dto.ScoreboardDto
import com.drew654.scoreboard.data.remote.dto.StatusDto
import com.drew654.scoreboard.data.remote.dto.StatusTypeDto
import com.drew654.scoreboard.data.remote.dto.TeamDto
import com.drew654.scoreboard.domain.model.scoreboard.HomeAway
import com.drew654.scoreboard.domain.model.scoreboard.RecordType
import com.drew654.scoreboard.domain.model.scoreboard.Season

object PreviewData {
    val sampleFinalCompetitionDto = CompetitionDto(
        id = 401752748,
        competitors = listOf(
            CompetitorDto(
                id = 99,
                homeAway = HomeAway.HOME,
                team = TeamDto(
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
                    LinescoreDto(
                        value = 7,
                        displayValue = "7",
                        period = 1
                    ),
                    LinescoreDto(
                        value = 11,
                        displayValue = "11",
                        period = 2
                    ),
                    LinescoreDto(
                        value = 0,
                        displayValue = "0",
                        period = 3
                    ),
                    LinescoreDto(
                        value = 7,
                        displayValue = "7",
                        period = 4
                    )
                ),
                records = listOf(
                    RecordDto(
                        name = "overall",
                        abbreviation = "Game",
                        type = RecordType.OVERALL,
                        summary = "5-3"
                    ),
                    RecordDto(
                        name = "Home",
                        abbreviation = null,
                        type = RecordType.HOME,
                        summary = "4-1"
                    ),
                    RecordDto(
                        name = "Road",
                        abbreviation = null,
                        type = RecordType.AWAY,
                        summary = "1-2"
                    ),
                    RecordDto(
                        name = "vs. Conf.",
                        abbreviation = null,
                        type = RecordType.CONF,
                        summary = "2-3"
                    )
                )
            ),
            CompetitorDto(
                id = 245,
                homeAway = HomeAway.AWAY,
                team = TeamDto(
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
                    LinescoreDto(
                        value = 14,
                        displayValue = "14",
                        period = 1
                    ),
                    LinescoreDto(
                        value = 0,
                        displayValue = "0",
                        period = 2
                    ),
                    LinescoreDto(
                        value = 21,
                        displayValue = "21",
                        period = 3
                    ),
                    LinescoreDto(
                        value = 14,
                        displayValue = "14",
                        period = 4
                    )
                ),
                records = listOf(
                    RecordDto(
                        name = "overall",
                        abbreviation = "Game",
                        type = RecordType.OVERALL,
                        summary = "8-0"
                    ),
                    RecordDto(
                        name = "Home",
                        abbreviation = null,
                        type = RecordType.HOME,
                        summary = "5-0"
                    ),
                    RecordDto(
                        name = "Road",
                        abbreviation = null,
                        type = RecordType.AWAY,
                        summary = "3-0"
                    ),
                    RecordDto(
                        name = "vs. Conf.",
                        abbreviation = null,
                        type = RecordType.CONF,
                        summary = "5-0"
                    )
                )
            )
        ),
        date = "2025-10-25T23:30:00Z",
        status = StatusDto(
            clock = 0,
            displayClock = "0:00",
            period = 4,
            type = StatusTypeDto(
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

    val sampleEndPeriodCompetitionDto = CompetitionDto(
        id = 401752763,
        competitors = listOf(
            CompetitorDto(
                id = 142,
                homeAway = HomeAway.HOME,
                team = TeamDto(
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
                    LinescoreDto(
                        value = 0,
                        displayValue = "0",
                        period = 1
                    )
                ),
                records = listOf(
                    RecordDto(
                        name = "overall",
                        abbreviation = "overall",
                        type = RecordType.OVERALL,
                        summary = "6-2"
                    ),
                    RecordDto(
                        name = "Home",
                        abbreviation = "Home",
                        type = RecordType.HOME,
                        summary = "5-1"
                    ),
                    RecordDto(
                        name = "Away",
                        abbreviation = "Away",
                        type = RecordType.AWAY,
                        summary = "1-1"
                    ),
                    RecordDto(
                        name = "vs. Conf.",
                        abbreviation = "CONF",
                        type = RecordType.CONF,
                        summary = "2-2"
                    )
                )
            ),
            CompetitorDto(
                id = 245,
                homeAway = HomeAway.AWAY,
                team = TeamDto(
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
                    LinescoreDto(
                        value = 7,
                        displayValue = "7",
                        period = 1
                    )
                ),
                records = listOf(
                    RecordDto(
                        name = "overall",
                        abbreviation = "overall",
                        type = RecordType.OVERALL,
                        summary = "8-0"
                    ),
                    RecordDto(
                        name = "Home",
                        abbreviation = "Home",
                        type = RecordType.HOME,
                        summary = "5-0"
                    ),
                    RecordDto(
                        name = "Away",
                        abbreviation = "Away",
                        type = RecordType.AWAY,
                        summary = "3-0"
                    ),
                    RecordDto(
                        name = "vs. Conf.",
                        abbreviation = "CONF",
                        type = RecordType.CONF,
                        summary = "5-0"
                    )
                )
            )
        ),
        date = "2025-11-08T20:30:00Z",
        status = StatusDto(
            clock = 0,
            displayClock = "0:00",
            period = 1,
            type = StatusTypeDto(
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

    val sampleInProgressCompetitionDto = CompetitionDto(
        id = 401752763,
        competitors = listOf(
            CompetitorDto(
                id = 142,
                homeAway = HomeAway.HOME,
                team = TeamDto(
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
                    LinescoreDto(
                        value = 0,
                        displayValue = "0",
                        period = 1
                    ),
                    LinescoreDto(
                        value = 0,
                        displayValue = "0",
                        period = 2
                    )
                ),
                records = listOf(
                    RecordDto(
                        name = "overall",
                        abbreviation = "overall",
                        type = RecordType.OVERALL,
                        summary = "6-2"
                    ),
                    RecordDto(
                        name = "Home",
                        abbreviation = "Home",
                        type = RecordType.HOME,
                        summary = "5-1"
                    ),
                    RecordDto(
                        name = "Away",
                        abbreviation = "Away",
                        type = RecordType.AWAY,
                        summary = "1-1"
                    ),
                    RecordDto(
                        name = "vs. Conf.",
                        abbreviation = "CONF",
                        type = RecordType.CONF,
                        summary = "2-2"
                    )
                )
            ),
            CompetitorDto(
                id = 245,
                homeAway = HomeAway.AWAY,
                team = TeamDto(
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
                    LinescoreDto(
                        value = 7,
                        displayValue = "7",
                        period = 1
                    ),
                    LinescoreDto(
                        value = 0,
                        displayValue = "0",
                        period = 2
                    )
                ),
                records = listOf(
                    RecordDto(
                        name = "overall",
                        abbreviation = "overall",
                        type = RecordType.OVERALL,
                        summary = "8 - 0"
                    ),
                    RecordDto(
                        name = "Home",
                        abbreviation = "Home",
                        type = RecordType.HOME,
                        summary = "5 - 0"
                    ),
                    RecordDto(
                        name = "Away",
                        abbreviation = "Away",
                        type = RecordType.AWAY,
                        summary = "3 - 0"
                    ),
                    RecordDto(
                        name = "vs.Conf.",
                        abbreviation = "CONF",
                        type = RecordType.CONF,
                        summary = "5 - 0"
                    )
                )
            )
        ),
        date = "2025-11-08T20:30:00Z",
        status = StatusDto(
            clock = 858,
            displayClock = "14:18",
            period = 2,
            type = StatusTypeDto(
                id = 2,
                name = "STATUS_IN_PROGRESS",
                state = "in",
                completed = false,
                description = "In Progress",
                detail = "14:18 - 2nd Quarter",
                shortDetail = "14:18 - 2nd"
            )
        )
    )

    val sampleScoreboard = ScoreboardDto(
        leagues = listOf(
            LeagueDto(
                id = 23,
                name = "NCAA - Football",
                abbreviation = "NCAAF",
                midsizeName = "NCAA Football",
                slug = "college-football",
                calendarStartDate = "2025-02-01T08:00Z",
                calendarEndDate = "2026-01-21T07:59Z",
                calendar = listOf(
                    ListCalendarDto(
                        label = "Regular Season",
                        value = 2,
                        startDate = "2025-08-23T07:00:00Z",
                        endDate = "2025-12-14T07:59:00Z",
                        entries = listOf(
                            ListCalendarEntryDto(
                                label = "Week 1",
                                alternateLabel = "Week 1",
                                detail = "Aug 23-Sep 1",
                                value = 1,
                                startDate = "2025-08-23T07:00:00Z",
                                endDate = "2025-09-02T06:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 2",
                                alternateLabel = "Week 2",
                                detail = "Sep 2-7",
                                value = 2,
                                startDate = "2025-09-02T07:00:00Z",
                                endDate = "2025-09-08T06:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 3",
                                alternateLabel = "Week 3",
                                detail = "Sep 8-14",
                                value = 3,
                                startDate = "2025-09-08T07:00:00Z",
                                endDate = "2025-09-15T06:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 4",
                                alternateLabel = "Week 4",
                                detail = "Sep 15-21",
                                value = 4,
                                startDate = "2025-09-15T07:00:00Z",
                                endDate = "2025-09-22T06:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 5",
                                alternateLabel = "Week 5",
                                detail = "Sep 22-28",
                                value = 5,
                                startDate = "2025-09-22T07:00:00Z",
                                endDate = "2025-09-29T06:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 6",
                                alternateLabel = "Week 6",
                                detail = "Sep 29-Oct 5",
                                value = 6,
                                startDate = "2025-09-29T07:00:00Z",
                                endDate = "2025-10-06T06:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 7",
                                alternateLabel = "Week 7",
                                detail = "Oct 6-12",
                                value = 7,
                                startDate = "2025-10-06T07:00:00Z",
                                endDate = "2025-10-13T06:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 8",
                                alternateLabel = "Week 8",
                                detail = "Oct 13-19",
                                value = 8,
                                startDate = "2025-10-13T07:00:00Z",
                                endDate = "2025-10-20T06:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 9",
                                alternateLabel = "Week 9",
                                detail = "Oct 20-26",
                                value = 9,
                                startDate = "2025-10-20T07:00:00Z",
                                endDate = "2025-10-27T06:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 10",
                                alternateLabel = "Week 10",
                                detail = "Oct 27-Nov 2",
                                value = 10,
                                startDate = "2025-10-27T07:00:00Z",
                                endDate = "2025-11-03T07:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 11",
                                alternateLabel = "Week 11",
                                detail = "Nov 3-9",
                                value = 11,
                                startDate = "2025-11-03T08:00:00Z",
                                endDate = "2025-11-10T07:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 12",
                                alternateLabel = "Week 12",
                                detail = "Nov 10-16",
                                value = 12,
                                startDate = "2025-11-10T08:00:00Z",
                                endDate = "2025-11-17T07:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 13",
                                alternateLabel = "Week 13",
                                detail = "Nov 17-23",
                                value = 13,
                                startDate = "2025-11-17T08:00:00Z",
                                endDate = "2025-11-24T07:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 14",
                                alternateLabel = "Week 14",
                                detail = "Nov 24-30",
                                value = 14,
                                startDate = "2025-11-24T08:00:00Z",
                                endDate = "2025-12-01T07:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 15",
                                alternateLabel = "Week 15",
                                detail = "Dec 1-7",
                                value = 15,
                                startDate = "2025-12-01T08:00:00Z",
                                endDate = "2025-12-08T07:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "Week 16",
                                alternateLabel = "Week 16",
                                detail = "Dec 8-13",
                                value = 16,
                                startDate = "2025-12-08T08:00:00Z",
                                endDate = "2026-12-14T07:59:00Z"
                            )
                        )
                    ),
                    ListCalendarDto(
                        label = "Postseason",
                        value = 3,
                        startDate = "2025-12-13T08:00:00Z",
                        endDate = "2026-01-21T07:59:00Z",
                        entries = listOf(
                            ListCalendarEntryDto(
                                label = "Bowls",
                                alternateLabel = "Bowls",
                                detail = "Dec 13-Jan 20",
                                value = 1,
                                startDate = "2025-12-13T08:00:00Z",
                                endDate = "2026-01-21T07:59:00Z"
                            ),
                            ListCalendarEntryDto(
                                label = "CFP",
                                alternateLabel = "CFP",
                                detail = "Dec 19-Jan 20",
                                value = 999,
                                startDate = "2025-12-19T08:00:00Z",
                                endDate = "2026-01-20T07:59:00Z"
                            )
                        )
                    ),
                    ListCalendarDto(
                        label = "Off Season",
                        value = 4,
                        startDate = "2026-01-21T08:00:00Z",
                        endDate = "2026-02-01T07:59:00Z",
                        entries = listOf(
                            ListCalendarEntryDto(
                                label = "All-Star",
                                alternateLabel = "All-Star",
                                detail = "Jan 21-31",
                                value = 1,
                                startDate = "2026-01-21T08:00:00Z",
                                endDate = "2026-02-01T07:59:00Z"
                            )
                        )
                    )
                )
            )
        ),
        season = Season(
            type = 2,
            year = 2025
        ),
        events = listOf(
            EventDto(
                id = 401752763,
                name = "Texas A&M Aggies at Missouri Tigers",
                shortName = "TA&M @ MIZ",
                competitions = listOf(
                    CompetitionDto(
                        id = 401752763,
                        competitors = listOf(
                            CompetitorDto(
                                id = 142,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
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
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 2
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "6-2"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "5-1"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "1-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "2-2"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 245,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
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
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 2
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "8-0"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "5-0"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "3-0"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "5-0"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T20:30:00Z",
                        status = StatusDto(
                            clock = 110,
                            displayClock = "1:50",
                            period = 2,
                            type = StatusTypeDto(
                                id = 2,
                                name = "STATUS_IN_PROGRESS",
                                state = "in",
                                completed = false,
                                description = "In Progress",
                                detail = "1:50 - 2nd Quarter",
                                shortDetail = "1:50 - 2nd"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401752898,
                name = "Oregon Ducks at Iowa Hawkeyes",
                shortName = "ORE @ IOWA",
                competitions = listOf(
                    CompetitionDto(
                        id = 401752898,
                        competitors = listOf(
                            CompetitorDto(
                                id = 2294,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 2294,
                                    location = "Iowa",
                                    name = "Hawkeyes",
                                    abbreviation = "IOWA",
                                    displayName = "Iowa Hawkeyes",
                                    shortDisplayName = "Iowa",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/2294.png"
                                ),
                                score = 7,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 2
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "6-2"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "2-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "4-1"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 2483,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 2483,
                                    location = "Oregon",
                                    name = "Ducks",
                                    abbreviation = "ORE",
                                    displayName = "Oregon Ducks",
                                    shortDisplayName = "Oregon",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/2483.png"
                                ),
                                score = 9,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 2,
                                        displayValue = "2",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 2
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "7-1"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "3-0"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "4-1"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T20:30:00Z",
                        status = StatusDto(
                            clock = 92,
                            displayClock = "1:32",
                            period = 2,
                            type = StatusTypeDto(
                                id = 2,
                                name = "STATUS_IN_PROGRESS",
                                state = "in",
                                completed = false,
                                description = "In Progress",
                                detail = "1:32 - 2nd Quarter",
                                shortDetail = "1:32 - 2nd"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401754587,
                name = "Syracuse Orange at Miami Hurricanes",
                shortName = "SYR @ MIA",
                competitions = listOf(
                    CompetitionDto(
                        id = 401754587,
                        competitors = listOf(
                            CompetitorDto(
                                id = 2390,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 2390,
                                    location = "Miami",
                                    name = "Hurricanes",
                                    abbreviation = "MIA",
                                    displayName = "Miami Hurricanes",
                                    shortDisplayName = "Miami",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/2390.png"
                                ),
                                score = 14,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 14,
                                        displayValue = "14",
                                        period = 2
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "6-2"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "5-1"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "1-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "2-2"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 183,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 183,
                                    location = "Syracuse",
                                    name = "Orange",
                                    abbreviation = "SYR",
                                    displayName = "Syracuse Orange",
                                    shortDisplayName = "Syracuse",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/183.png"
                                ),
                                score = 0,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 2
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "3-6"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "2-3"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "1-2"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "1-5"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T20:30:00Z",
                        status = StatusDto(
                            clock = 35,
                            displayClock = "0:35",
                            period = 2,
                            type = StatusTypeDto(
                                id = 2,
                                name = "STATUS_IN_PROGRESS",
                                state = "in",
                                completed = false,
                                description = "In Progress",
                                detail = "0:35 - 2nd Quarter",
                                shortDetail = "0:35 - 2nd"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401752764,
                name = "Auburn Tigers at Vanderbilt Commodores",
                shortName = "AUB @ VAN",
                competitions = listOf(
                    CompetitionDto(
                        id = 401752764,
                        competitors = listOf(
                            CompetitorDto(
                                id = 238,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 238,
                                    location = "Vanderbilt",
                                    name = "Commodores",
                                    abbreviation = "VAN",
                                    displayName = "Vanderbilt Commodores",
                                    shortDisplayName = "Vanderbilt",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/238.png"
                                ),
                                score = 3,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 2
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "7-2"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "5-0"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "2-2"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "3-2"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 2,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 2,
                                    location = "Auburn",
                                    name = "Tigers",
                                    abbreviation = "AUB",
                                    displayName = "Auburn Tigers",
                                    shortDisplayName = "Auburn",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/2.png"
                                ),
                                score = 14,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 2
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "4-5"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "2-3"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "2-2"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "1-5"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T21:00:00Z",
                        status = StatusDto(
                            clock = 330,
                            displayClock = "5:30",
                            period = 2,
                            type = StatusTypeDto(
                                id = 2,
                                name = "STATUS_IN_PROGRESS",
                                state = "in",
                                completed = false,
                                description = "In Progress",
                                detail = "5:30 - 2nd Quarter",
                                shortDetail = "5:30 - 2nd"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401752899,
                name = "Washington Huskies at Wisconsin Badgers",
                shortName = "WASH @ WIS",
                competitions = listOf(
                    CompetitionDto(
                        id = 401752899,
                        competitors = listOf(
                            CompetitorDto(
                                id = 275,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 275,
                                    location = "Wisconsin",
                                    name = "Badgers",
                                    abbreviation = "WIS",
                                    displayName = "Wisconsin Badgers",
                                    shortDisplayName = "Wisconsin",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/275.png"
                                ),
                                score = 0,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "2-6"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "2-3"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "0-3"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "0-5"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 264,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 264,
                                    location = "Washington",
                                    name = "Huskies",
                                    abbreviation = "WASH",
                                    displayName = "Washington Huskies",
                                    shortDisplayName = "Washington",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/264.png"
                                ),
                                score = 0,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "6-2"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "2-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "3-2"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T21:30:00Z",
                        status = StatusDto(
                            clock = 493,
                            displayClock = "8:13",
                            period = 1,
                            type = StatusTypeDto(
                                id = 2,
                                name = "STATUS_IN_PROGRESS",
                                state = "in",
                                completed = false,
                                description = "In Progress",
                                detail = "8:13 - 1st Quarter",
                                shortDetail = "8:13 - 1st"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401752897,
                name = "Ohio State Buckeyes at Purdue Boilermakers",
                shortName = "OSU @ PUR",
                competitions = listOf(
                    CompetitionDto(
                        id = 401752897,
                        competitors = listOf(
                            CompetitorDto(
                                id = 2509,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 2509,
                                    location = "Purdue",
                                    name = "Boilermakers",
                                    abbreviation = "PUR",
                                    displayName = "Purdue Boilermakers",
                                    shortDisplayName = "Purdue",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/2509.png"
                                ),
                                score = 10,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "2-8"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "2-4"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "0-4"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "0-7"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 194,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 194,
                                    location = "Ohio State",
                                    name = "Buckeyes",
                                    abbreviation = "OSU",
                                    displayName = "Ohio State Buckeyes",
                                    shortDisplayName = "Ohio State",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/194.png"
                                ),
                                score = 34,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 24,
                                        displayValue = "24",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 10,
                                        displayValue = "10",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "9-0"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "5-0"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "4-0"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "6-0"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T18:00:00Z",
                        status = StatusDto(
                            clock = 0,
                            displayClock = "0:00",
                            period = 4,
                            type = StatusTypeDto(
                                id = 3,
                                name = "STATUS_FINAL",
                                state = "post",
                                completed = true,
                                description = "Final",
                                detail = "Final",
                                shortDetail = "Final"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401752893,
                name = "Indiana Hoosiers at Penn State Nittany Lions",
                shortName = "IU @ PSU",
                competitions = listOf(
                    CompetitionDto(
                        id = 401752893,
                        competitors = listOf(
                            CompetitorDto(
                                id = 213,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 213,
                                    location = "Penn State",
                                    name = "Nittany Lions",
                                    abbreviation = "PSU",
                                    displayName = "Penn State Nittany Lions",
                                    shortDisplayName = "Penn State",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/213.png"
                                ),
                                score = 24,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 14,
                                        displayValue = "14",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "3-6"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "3-3"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "0-3"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "0-6"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 84,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 84,
                                    location = "Indiana",
                                    name = "Hoosiers",
                                    abbreviation = "IU",
                                    displayName = "Indiana Hoosiers",
                                    shortDisplayName = "Indiana",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/84.png"
                                ),
                                score = 27,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 10,
                                        displayValue = "10",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "10-0"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "6-0"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "4-0"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "7-0"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T17:00:00Z",
                        status = StatusDto(
                            clock = 0,
                            displayClock = "0:00",
                            period = 4,
                            type = StatusTypeDto(
                                id = 3,
                                name = "STATUS_FINAL",
                                state = "post",
                                completed = true,
                                description = "Final",
                                detail = "Final",
                                shortDetail = "Final"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401752762,
                name = "Georgia Bulldogs at Mississippi State Bulldogs",
                shortName = "UGA @ MSST",
                competitions = listOf(
                    CompetitionDto(
                        id = 401752762,
                        competitors = listOf(
                            CompetitorDto(
                                id = 344,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 344,
                                    location = "Mississippi State",
                                    name = "Bulldogs",
                                    abbreviation = "MSST",
                                    displayName = "Mississippi State Bulldogs",
                                    shortDisplayName = "Mississippi St",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/344.png"
                                ),
                                score = 21,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "5-5"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "3-3"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "2-2"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "1-5"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 61,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 61,
                                    location = "Georgia",
                                    name = "Bulldogs",
                                    abbreviation = "UGA",
                                    displayName = "Georgia Bulldogs",
                                    shortDisplayName = "Georgia",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/61.png"
                                ),
                                score = 41,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 21,
                                        displayValue = "21",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 14,
                                        displayValue = "14",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "8-1"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "3-0"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "6-1"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T17:00:00Z",
                        status = StatusDto(
                            clock = 0,
                            displayClock = "0:00",
                            period = 4,
                            type = StatusTypeDto(
                                id = 3,
                                name = "STATUS_FINAL",
                                state = "post",
                                completed = true,
                                description = "Final",
                                detail = "Final",
                                shortDetail = "Final"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401752761,
                name = "The Citadel Bulldogs at Ole Miss Rebels",
                shortName = "CIT @ MISS",
                competitions = listOf(
                    CompetitionDto(
                        id = 401752761,
                        competitors = listOf(
                            CompetitorDto(
                                id = 145,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 145,
                                    location = "Ole Miss",
                                    name = "Rebels",
                                    abbreviation = "MISS",
                                    displayName = "Ole Miss Rebels",
                                    shortDisplayName = "Ole Miss",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/145.png"
                                ),
                                score = 49,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 21,
                                        displayValue = "21",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 14,
                                        displayValue = "14",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "9-1"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "7-0"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "2-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "5-1"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 2643,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 2643,
                                    location = "The Citadel",
                                    name = "Bulldogs",
                                    abbreviation = "CIT",
                                    displayName = "The Citadel Bulldogs",
                                    shortDisplayName = "The Citadel",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/2643.png"
                                ),
                                score = 0,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "4-6"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "2-3"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "2-3"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "3-3"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T18:00:00Z",
                        status = StatusDto(
                            clock = 0,
                            displayClock = "0:00",
                            period = 4,
                            type = StatusTypeDto(
                                id = 3,
                                name = "STATUS_FINAL",
                                state = "post",
                                completed = true,
                                description = "Final",
                                detail = "Final",
                                shortDetail = "Final"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401756945,
                name = "BYU Cougars at Texas Tech Red Raiders",
                shortName = "BYU @ TTU",
                competitions = listOf(
                    CompetitionDto(
                        id = 401756945,
                        competitors = listOf(
                            CompetitorDto(
                                id = 2641,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 2641,
                                    location = "Texas Tech",
                                    name = "Red Raiders",
                                    abbreviation = "TTU",
                                    displayName = "Texas Tech Red Raiders",
                                    shortDisplayName = "Texas Tech",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/2641.png"
                                ),
                                score = 29,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 10,
                                        displayValue = "10",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 6,
                                        displayValue = "6",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 10,
                                        displayValue = "10",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "9-1"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "6-0"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "3-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "6-1"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 252,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 252,
                                    location = "BYU",
                                    name = "Cougars",
                                    abbreviation = "BYU",
                                    displayName = "BYU Cougars",
                                    shortDisplayName = "BYU",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/252.png"
                                ),
                                score = 7,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "8-1"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "4-0"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "5-1"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T17:00:00Z",
                        status = StatusDto(
                            clock = 0,
                            displayClock = "0:00",
                            period = 4,
                            type = StatusTypeDto(
                                id = 3,
                                name = "STATUS_FINAL",
                                state = "post",
                                completed = true,
                                description = "Final",
                                detail = "Final",
                                shortDetail = "Final"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401754589,
                name = "Wake Forest Demon Deacons at Virginia Cavaliers",
                shortName = "WAKE @ UVA",
                competitions = listOf(
                    CompetitionDto(
                        id = 401754589,
                        competitors = listOf(
                            CompetitorDto(
                                id = 258,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 258,
                                    location = "Virginia",
                                    name = "Cavaliers",
                                    abbreviation = "UVA",
                                    displayName = "Virginia Cavaliers",
                                    shortDisplayName = "Virginia",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/258.png"
                                ),
                                score = 0,
                                linescores = listOf(),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "8-1"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "5-0"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "3-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "5-0"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 154,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 154,
                                    location = "Wake Forest",
                                    name = "Demon Deacons",
                                    abbreviation = "WAKE",
                                    displayName = "Wake Forest Demon Deacons",
                                    shortDisplayName = "Wake Forest",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/154.png"
                                ),
                                score = 0,
                                linescores = listOf(),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "5-3"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "3-2"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "2-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "2-3"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-09T00:00:00Z",
                        status = StatusDto(
                            clock = 0,
                            displayClock = "0:00",
                            period = 0,
                            type = StatusTypeDto(
                                id = 1,
                                name = "STATUS_SCHEDULED",
                                state = "pre",
                                completed = false,
                                description = "Scheduled",
                                detail = "Sat, November 8th at 7:00 PM EST",
                                shortDetail = "11/8 - 7:00 PM EST"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401754585,
                name = "California Golden Bears at Louisville Cardinals",
                shortName = "CAL @ LOU",
                competitions = listOf(
                    CompetitionDto(
                        id = 401754585,
                        competitors = listOf(
                            CompetitorDto(
                                id = 97,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 97,
                                    location = "Louisville",
                                    name = "Cardinals",
                                    abbreviation = "LOU",
                                    displayName = "Louisville Cardinals",
                                    shortDisplayName = "Louisville",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/97.png"
                                ),
                                score = 0,
                                linescores = listOf(),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "7-1"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "3-0"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "4-1"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 25,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 25,
                                    location = "California",
                                    name = "Golden Bears",
                                    abbreviation = "CAL",
                                    displayName = "California Golden Bears",
                                    shortDisplayName = "California",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/25.png"
                                ),
                                score = 0,
                                linescores = listOf(),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "5-4"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "3-2"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "2-2"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "2-3"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-09T00:00:00Z",
                        status = StatusDto(
                            clock = 0,
                            displayClock = "0:00",
                            period = 0,
                            type = StatusTypeDto(
                                id = 1,
                                name = "STATUS_SCHEDULED",
                                state = "pre",
                                completed = false,
                                description = "Scheduled",
                                detail = "Sat, November 8th at 7:00 PM EST",
                                shortDetail = "11/8 - 7:00 PM EST"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401752759,
                name = "LSU Tigers at Alabama Crimson Tide",
                shortName = "LSU @ ALA",
                competitions = listOf(
                    CompetitionDto(
                        id = 401752759,
                        competitors = listOf(
                            CompetitorDto(
                                id = 333,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 333,
                                    location = "Alabama",
                                    name = "Crimson Tide",
                                    abbreviation = "ALA",
                                    displayName = "Alabama Crimson Tide",
                                    shortDisplayName = "Alabama",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/333.png"
                                ),
                                score = 0,
                                linescores = listOf(),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "7-1"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "4-0"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "3-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "5-0"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 99,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 99,
                                    location = "LSU",
                                    name = "Tigers",
                                    abbreviation = "LSU",
                                    displayName = "LSU Tigers",
                                    shortDisplayName = "LSU",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/99.png"
                                ),
                                score = 0,
                                linescores = listOf(),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "5-3"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "1-2"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "2-3"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-09T00:30:00Z",
                        status = StatusDto(
                            clock = 0,
                            displayClock = "0:00",
                            period = 0,
                            type = StatusTypeDto(
                                id = 1,
                                name = "STATUS_SCHEDULED",
                                state = "pre",
                                completed = false,
                                description = "Scheduled",
                                detail = "Sat, November 8th at 7:30 PM EST",
                                shortDetail = "11/8 - 7:30 PM EST"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401757166,
                name = "Navy Midshipmen at Notre Dame Fighting Irish",
                shortName = "NAVY @ ND",
                competitions = listOf(
                    CompetitionDto(
                        id = 401757166,
                        competitors = listOf(
                            CompetitorDto(
                                id = 87,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 87,
                                    location = "Notre Dame",
                                    name = "Fighting Irish",
                                    abbreviation = "ND",
                                    displayName = "Notre Dame Fighting Irish",
                                    shortDisplayName = "Notre Dame",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/87.png"
                                ),
                                score = 0,
                                linescores = listOf(),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "6-2"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "2-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "0-0"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 2426,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 2426,
                                    location = "Navy",
                                    name = "Midshipmen",
                                    abbreviation = "NAVY",
                                    displayName = "Navy Midshipmen",
                                    shortDisplayName = "Navy",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/2426.png"
                                ),
                                score = 0,
                                linescores = listOf(),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "7-1"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "5-0"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "2-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "5-1"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-09T00:30:00Z",
                        status = StatusDto(
                            clock = 0,
                            displayClock = "0:00",
                            period = 0,
                            type = StatusTypeDto(
                                id = 1,
                                name = "STATUS_SCHEDULED",
                                state = "pre",
                                completed = false,
                                description = "Scheduled",
                                detail = "Sat, November 8th at 7:30 PM EST",
                                shortDetail = "11/8 - 7:30 PM EST"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401752896,
                name = "Northwestern Wildcats at USC Trojans",
                shortName = "NU @ USC",
                competitions = listOf(
                    CompetitionDto(
                        id = 401752896,
                        competitors = listOf(
                            CompetitorDto(
                                id = 30,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 30,
                                    location = "USC",
                                    name = "Trojans",
                                    abbreviation = "USC",
                                    displayName = "USC Trojans",
                                    shortDisplayName = "USC",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/30.png"
                                ),
                                score = 38,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 14,
                                        displayValue = "14",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 10,
                                        displayValue = "10",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "7-2"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "5-0"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "2-2"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "5-1"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 77,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 77,
                                    location = "Northwestern",
                                    name = "Wildcats",
                                    abbreviation = "NU",
                                    displayName = "Northwestern Wildcats",
                                    shortDisplayName = "Northwestern",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/77.png"
                                ),
                                score = 17,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "5-4"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "1-3"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "3-3"
                                    )
                                )
                            )
                        ),
                        date = "2025-11-08T02:00:00Z",
                        status = StatusDto(
                            clock = 0,
                            displayClock = "0:00",
                            period = 4,
                            type = StatusTypeDto(
                                id = 3,
                                name = "STATUS_FINAL",
                                state = "post",
                                completed = true,
                                description = "Final",
                                detail = "Final",
                                shortDetail = "Final"
                            )
                        )
                    )
                )
            )
        )
    )
}
