package com.learning.leetcode;

public class FindMaxSubArray {

    public static int maxSubArray(int[] nums) {

        int globalMax = Integer.MIN_VALUE;
        int currectMax = 0;

        for(int i = 0; i < nums.length; i++){

            currectMax = Math.max(nums[i], currectMax + nums[i]);

            if(currectMax > globalMax){
                globalMax = currectMax;
            }
        }
        return globalMax;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
