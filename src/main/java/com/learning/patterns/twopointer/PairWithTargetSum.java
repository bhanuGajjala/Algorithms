package com.learning.patterns.twopointer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairWithTargetSum {


    // this will work perfectly with sorted arrays.
    public int[] findSumPair(int[] input, int target) {

        int startPointer = 0;
        int endPointer = input.length - 1;

        while (startPointer < endPointer) {

            int targetSum = input[startPointer] + input[endPointer];

            if (targetSum == target) {
                return new int[]{startPointer, endPointer};
            } else if (targetSum > target) {
                endPointer--;
            } else {
                startPointer++;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] findSumPairUnsortedArray(int[] input, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {

            if (map.containsKey(target - input[i])) {
                return new int[]{map.get(target - input[i]), i};
            } else {
                map.put(input[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
