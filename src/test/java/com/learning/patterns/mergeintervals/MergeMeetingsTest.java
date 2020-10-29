package com.learning.patterns.mergeintervals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeMeetingsTest {

    MergeMeetings mergeMeetings;

    @BeforeEach
    public void setUp(){
        mergeMeetings = new MergeMeetings();
    }

    @Test
    public void testMergeMeetings(){
        List<Meeting> meetings = Arrays.asList(new Meeting(2,3), new Meeting(3,5), new Meeting(1,2), new Meeting(4,6));

        List<Meeting> results = mergeMeetings.mergeMeetings(meetings);

    }


}