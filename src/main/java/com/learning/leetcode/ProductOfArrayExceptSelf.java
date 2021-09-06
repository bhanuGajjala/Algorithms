package com.learning.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {

        int answer[] = new int[nums.length];


        int left[] = new int[nums.length];
        int right[] = new int[nums.length];

        left[0] = 1;

        for (int i = 1; i < nums.length; i++) {

            left[i] = left[i - 1] * nums[i - 1];

        }

        right[nums.length - 1] = 1;

        for (int i = nums.length - 2; i >= 0; i--) {

            right[i] = nums[i + 1] * right[i + 1];

        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = left[i] * right[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        int input[] = {-1,1,0,-3,3};

        Arrays.stream(productExceptSelf(input)).forEach(i -> System.out.print(i + ","));
    }
}
