package com.learning.leetcode;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if(nums.length == 0)return 0;

        int maxSub=nums[0];
        int minSub=nums[0];
        int maxProdSub=nums[0];

        for(int i=1; i<nums.length; i++){
            if(nums[i]<0){
                int temp=maxSub;
                maxSub=minSub;
                minSub=temp;
            }

            maxSub=Math.max(maxSub*nums[i], nums[i]);
            minSub=Math.min(minSub*nums[i], nums[i]);

            maxProdSub=Math.max(maxProdSub, maxSub);
        }
        return maxProdSub;
    }
}
