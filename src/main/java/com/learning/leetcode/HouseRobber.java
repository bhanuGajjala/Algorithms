package com.learning.leetcode;

public class HouseRobber {

    public int rob(int[] nums) {

        int length = nums.length;

        if(length == 0){
            return 0;
        }

        int prev[] = new int[length+1];

        prev[length] = 0;
        prev[length - 1] = nums[length - 1];

        for(int i= length - 2; i >= 0; --i){
            prev[i] = Math.max(prev[i+1] + nums[i+2], nums[i]);
        }

        return prev[0];

    }


}
