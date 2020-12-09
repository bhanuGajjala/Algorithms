package com.learning.algorithms.arrays.dailycodingproblem.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem224Test {

    Problem224 problem224;

    @BeforeEach
    public void setUp() {
        problem224 = new Problem224();
    }


    @Test
    public void testFindSmallestNumber(){
        int input[] = {1,2,3,10};
        int output = problem224.findSmallestNumber(input);

        Assertions.assertEquals(output, 7);


        input = new int[]{1,1,3,6,8,10};
        output = problem224.findSmallestNumber(input);

        Assertions.assertEquals(output, 30);
    }
}