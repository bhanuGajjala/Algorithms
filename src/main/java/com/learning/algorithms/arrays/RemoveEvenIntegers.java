package com.learning.algorithms.arrays;

import java.util.Arrays;

public class RemoveEvenIntegers extends Array {

    public int[] removeEvenIntegers(int[] input) {

        return Arrays.stream(input).filter(i -> i % 2 == 0).toArray();

    }

    public int[] removeOddIntegers(int[] input){
        return Arrays.stream(input).filter(i -> i % 2 != 0).toArray();
    }
}