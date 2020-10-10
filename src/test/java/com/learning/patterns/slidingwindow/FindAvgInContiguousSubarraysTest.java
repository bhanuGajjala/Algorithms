package com.learning.patterns.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FindAvgInContiguousSubarraysTest {

    FindAvgInContiguousSubarrays findAvgInContiguousSubarrays;

    @BeforeEach
    public void setUp(){
        findAvgInContiguousSubarrays = new FindAvgInContiguousSubarrays();
    }

    @Test
    public void findAvgTest(){

        int[] input = {1,2,3,4,5,6,7,8};
        double[] expected = {2.0, 3.0, 4.0, 5.0, 6.0, 7.0};

        double[] output = findAvgInContiguousSubarrays.findAvg(input, 3);

        Assertions.assertEquals(expected.length, output.length);
        Assertions.assertEquals(true, Arrays.equals(expected, output));
    }
}
