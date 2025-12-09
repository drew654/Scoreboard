package com.drew654.scoreboard.presentation.preview

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
import com.drew654.summary.data.remote.dto.EndDto
import com.drew654.summary.data.remote.dto.LastPlayDto
import com.drew654.summary.data.remote.dto.SituationDto
import com.drew654.summary.data.remote.dto.StartDto

object MockData {
    val sampleScoreboardDto = ScoreboardDto(
        leagues = listOf(
            LeagueDto(
                id = 23,
                name = "NCAA - Football",
                abbreviation = "NCAAF",
                midsizeName = "NCAA Football",
                slug = "college-football",
                calendarStartDate = "2025-02-01T08:00:00Z",
                calendarEndDate = "2026-01-21T07:59:00Z",
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
                id = 401777353,
                name = "Indiana Hoosiers at Ohio State Buckeyes",
                shortName = "IU VS OSU",
                competitions = listOf(
                    CompetitionDto(
                        id = 401777353,
                        competitors = listOf(
                            CompetitorDto(
                                id = 194,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 194,
                                    location = "Ohio State",
                                    name = "Buckeyes",
                                    abbreviation = "OSU",
                                    displayName = "Ohio State Buckeyes",
                                    shortDisplayName = "Ohio State",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/194.png"
                                ),
                                score = 10,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
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
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "12-0"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "7-0"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "5-0"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "9-0"
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
                                score = 13,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
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
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "12-0"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "7-0"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "5-0"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "9-0"
                                    )
                                )
                            )
                        ),
                        date = "2025-12-07T01:00:00Z",
                        situation = SituationDto(
                            awayTimeouts = 0,
                            distance = 7,
                            down = 0,
                            downDistanceText = null,
                            homeTimeouts = 0,
                            isRedZone = false,
                            lastPlay = LastPlayDto(
                                end = EndDto(yardLine = 40),
                                id = "401777353639",
                                start = StartDto(yardLine = 40)
                            ),
                            possessionText = null,
                            shortDownDistanceText = null,
                            yardLine = 40
                        ),
                        status = StatusDto(
                            clock = 18,
                            displayClock = "0:18",
                            period = 4,
                            type = StatusTypeDto(
                                id = 2,
                                name = "STATUS_IN_PROGRESS",
                                state = "in",
                                completed = false,
                                description = "In Progress",
                                detail = "0:18 - 4th Quarter",
                                shortDetail = "0:18 - 4th"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401777328,
                name = "Duke Blue Devils at Virginia Cavaliers",
                shortName = "DUKE VS UVA",
                competitions = listOf(
                    CompetitionDto(
                        id = 401777328,
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
                                score = 13,
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
                                        value = 3,
                                        displayValue = "3",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "10-2"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "6-1"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "7-1"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 150,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 150,
                                    location = "Duke",
                                    name = "Blue Devils",
                                    abbreviation = "DUKE",
                                    displayName = "Duke Blue Devils",
                                    shortDisplayName = "Duke",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/150.png"
                                ),
                                score = 20,
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
                                        value = 3,
                                        displayValue = "3",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "overall",
                                        type = RecordType.OVERALL,
                                        summary = "7-5"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = "Home",
                                        type = RecordType.HOME,
                                        summary = "3-3"
                                    ),
                                    RecordDto(
                                        name = "Away",
                                        abbreviation = "Away",
                                        type = RecordType.AWAY,
                                        summary = "4-2"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = "CONF",
                                        type = RecordType.CONF,
                                        summary = "6-2"
                                    )
                                )
                            )
                        ),
                        date = "2025-12-07T01:00:00Z",
                        situation = SituationDto(
                            awayTimeouts = 0,
                            distance = -1,
                            down = -1,
                            downDistanceText = null,
                            homeTimeouts = 0,
                            isRedZone = false,
                            lastPlay = LastPlayDto(
                                end = EndDto(yardLine = 35),
                                id = "401777328651",
                                start = StartDto(yardLine = 75)
                            ),
                            possessionText = null,
                            shortDownDistanceText = null,
                            yardLine = 35
                        ),
                        status = StatusDto(
                            clock = 234,
                            displayClock = "3:54",
                            period = 4,
                            type = StatusTypeDto(
                                id = 2,
                                name = "STATUS_IN_PROGRESS",
                                state = "in",
                                completed = false,
                                description = "In Progress",
                                detail = "3:54 - 4th Quarter",
                                shortDetail = "3:54 - 4th"
                            )
                        )
                    )
                )
            ),
            EventDto(
                id = 401777351,
                name = "Georgia Bulldogs at Alabama Crimson Tide",
                shortName = "UGA VS ALA",
                competitions = listOf(
                    CompetitionDto(
                        id = 401777351,
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
                                        summary = "10-3"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "6-1"
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
                                        summary = "7-1"
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
                                score = 28,
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
                                        summary = "12-1"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "6-1"
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
                                        summary = "7-1"
                                    )
                                )
                            )
                        ),
                        date = "2025-12-06T21:00:00Z",
                        situation = null,
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
                id = 401777327,
                name = "BYU Cougars at Texas Tech Red Raiders",
                shortName = "BYU VS TTU",
                competitions = listOf(
                    CompetitionDto(
                        id = 401777327,
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
                                score = 34,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 13,
                                        displayValue = "13",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 8,
                                        displayValue = "8",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 13,
                                        displayValue = "13",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "12-1"
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
                                        summary = "4-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "8-1"
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
                                        summary = "11-2"
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
                                        summary = "5-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "8-1"
                                    )
                                )
                            )
                        ),
                        date = "2025-12-06T17:00:00Z",
                        situation = null,
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
                id = 401777324,
                name = "North Texas Mean Green at Tulane Green Wave",
                shortName = "UNT @ TULN",
                competitions = listOf(
                    CompetitionDto(
                        id = 401777324,
                        competitors = listOf(
                            CompetitorDto(
                                id = 2655,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 2655,
                                    location = "Tulane",
                                    name = "Green Wave",
                                    abbreviation = "TULN",
                                    displayName = "Tulane Green Wave",
                                    shortDisplayName = "Tulane",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/2655.png"
                                ),
                                score = 34,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 17,
                                        displayValue = "17",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 7,
                                        displayValue = "7",
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
                                        summary = "11-2"
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
                                        summary = "4-2"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "7-1"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 249,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 249,
                                    location = "North Texas",
                                    name = "Mean Green",
                                    abbreviation = "UNT",
                                    displayName = "North Texas Mean Green",
                                    shortDisplayName = "North Texas",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/249.png"
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
                                        value = 6,
                                        displayValue = "6",
                                        period = 3
                                    ),
                                    LinescoreDto(
                                        value = 8,
                                        displayValue = "8",
                                        period = 4
                                    )
                                ),
                                records = listOf(
                                    RecordDto(
                                        name = "overall",
                                        abbreviation = "Game",
                                        type = RecordType.OVERALL,
                                        summary = "11-2"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "6-1"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "5-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "7-1"
                                    )
                                )
                            )
                        ),
                        date = "2025-12-06T01:00:00Z",
                        situation = null,
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
                id = 401777352,
                name = "Troy Trojans at James Madison Dukes",
                shortName = "TROY @ JMU",
                competitions = listOf(
                    CompetitionDto(
                        id = 401777352,
                        competitors = listOf(
                            CompetitorDto(
                                id = 256,
                                homeAway = HomeAway.HOME,
                                team = TeamDto(
                                    id = 256,
                                    location = "James Madison",
                                    name = "Dukes",
                                    abbreviation = "JMU",
                                    displayName = "James Madison Dukes",
                                    shortDisplayName = "James Madison",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/256.png"
                                ),
                                score = 31,
                                linescores = listOf(
                                    LinescoreDto(
                                        value = 3,
                                        displayValue = "3",
                                        period = 1
                                    ),
                                    LinescoreDto(
                                        value = 14,
                                        displayValue = "14",
                                        period = 2
                                    ),
                                    LinescoreDto(
                                        value = 0,
                                        displayValue = "0",
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
                                        summary = "12-1"
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
                                        summary = "5-1"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "8-0"
                                    )
                                )
                            ),
                            CompetitorDto(
                                id = 2653,
                                homeAway = HomeAway.AWAY,
                                team = TeamDto(
                                    id = 2653,
                                    location = "Troy",
                                    name = "Trojans",
                                    abbreviation = "TROY",
                                    displayName = "Troy Trojans",
                                    shortDisplayName = "Troy",
                                    logo = "https://a.espncdn.com/i/teamlogos/ncaa/500/2653.png"
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
                                        summary = "8-5"
                                    ),
                                    RecordDto(
                                        name = "Home",
                                        abbreviation = null,
                                        type = RecordType.HOME,
                                        summary = "4-2"
                                    ),
                                    RecordDto(
                                        name = "Road",
                                        abbreviation = null,
                                        type = RecordType.AWAY,
                                        summary = "4-3"
                                    ),
                                    RecordDto(
                                        name = "vs. Conf.",
                                        abbreviation = null,
                                        type = RecordType.CONF,
                                        summary = "6-2"
                                    )
                                )
                            )
                        ),
                        date = "2025-12-06T00:00:00Z",
                        situation = null,
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
