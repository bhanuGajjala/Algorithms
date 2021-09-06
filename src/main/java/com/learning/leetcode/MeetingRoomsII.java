package com.learning.leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return 0;
        if(intervals.length == 1) return 1;

        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        PriorityQueue<Integer> roomsAvailable = new PriorityQueue<Integer>();

        roomsAvailable.add(intervals[0][1]);

        for(int i = 1; i < intervals.length; i++) {
            if(roomsAvailable.peek() <= intervals[i][0]) roomsAvailable.poll();
            roomsAvailable.add(intervals[i][1]);
        }

        return roomsAvailable.size();
    }

}
