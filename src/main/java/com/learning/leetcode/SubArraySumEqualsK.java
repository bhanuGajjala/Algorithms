package com.learning.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {

        int count = 0;

        for(int i= 0; i< nums.length; i++){

            int total = 0;

            for(int j=i; j < nums.length; j++){

                total = total + nums[j];
                if(total == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static int subarraySumMap(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int total = 0;

        for(int i= 0; i< nums.length; i++){

            total = total + nums[i];

            if(total == k){
                count++;
            }

            if(map.containsKey(total - k)){
                count = count + map.get(total - k);
            }

            map.put(total, map.getOrDefault(total, 0) + 1);

        }
        return count;
    }

    public static void main(String[] args) {
        int input[] = {1,-1,0};
//
        System.out.println(subarraySumMap(input, 0));


    }
}
