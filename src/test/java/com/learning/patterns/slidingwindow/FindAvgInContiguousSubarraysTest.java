package com.learning.patterns.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FindAvgInContiguousSubarraysTest {

    FindAvgInContiguousSubarrays findAvgInContiguousSubarrays;

    @BeforeEach
    public void setUp(){
        findAvgInContiguousSubarrays = new FindAvgInContiguousSubarrays();
    }

    @Test
    public void findAvgTest(){

        int[] input = {1,2,3,4,5,6,7,8};


        double[] output = findAvgInContiguousSubarrays.findAvg(input, 3);

        for(double d : output)
        System.out.println(d);


    }
}
