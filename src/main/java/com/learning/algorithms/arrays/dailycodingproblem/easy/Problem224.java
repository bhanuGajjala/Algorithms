package com.learning.algorithms.arrays.dailycodingproblem.easy;

/*
* This problem was asked by Amazon.

Given a sorted array, find the smallest positive integer that is not the sum of a subset of the array.

For example, for the input [1, 2, 3, 10], you should return 7.

Do this in O(N) time.
* */
public class Problem224 {

    public int findSmallestNumber(int[] input){

        int result = 1;

        for(int i = 0; i< input.length && input[i]<= result; i++){
            result += input[i];
        }

        return result;
    }

}
