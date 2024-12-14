package main.java.blind75.intervals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://neetcode.io/problems/meeting-schedule">Meeting Rooms</a>
 * <br>
 * <br>
 * Given an array of meeting time interval objects consisting of start and end times [[start_1,end_1],[start_2,end_2],...] (start_i < end_i),
 * determine if a person could add all meetings to their schedule without any conflicts.
 */
public class MeetingRooms {
    public static void main(String[] args) {
        Interval i1 = new Interval(0, 30);
        Interval i2 = new Interval(5, 10);
        Interval i3 = new Interval(15, 20);
        List<Interval> intervals = Arrays.asList(i1, i2, i3);

        System.out.println(canAttendMeetings(intervals));
    }

    // TC: o(nlogn)
    private static boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(Comparator.comparingInt(i -> i.start));

        for (int i = 1; i < intervals.size(); i++) {
            Interval i1 = intervals.get(i - 1);
            Interval i2 = intervals.get(i);

            if (i1.end > i2.start) {
                return false;
            }
        }

        return true;
    }
}
