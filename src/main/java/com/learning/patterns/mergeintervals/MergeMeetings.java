package com.learning.patterns.mergeintervals;

import java.util.*;

public class MergeMeetings {

    public List<Meeting> mergeMeetings(List<Meeting> meetings) {


        List<Meeting> mergeMeetings = new ArrayList<>();

        meetings.sort((Meeting a, Meeting b) -> a.getStartTime() - b.getStartTime());

        mergeMeetings.add(meetings.get(0));

        for (Meeting meet : meetings) {

            Meeting previousMeeting = mergeMeetings.get(mergeMeetings.size() - 1);

            if (previousMeeting.getEndTime() > meet.getStartTime()) {
                previousMeeting.setEndTime(Math.max(previousMeeting.getEndTime(), meet.getEndTime()));

            } else {
                mergeMeetings.add(meet);
            }
        }

        return mergeMeetings;

    }
}
