package com.learning.leetcode;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int area=0;
        int i=0;
        int j=height.length-1;
        while(i<j)
        {
            if(height[i]>height[j])
            {
                area=height[j]*(j-i);
                if(max<area)
                {
                    max=area;
                }
                j--;
            }
            else
            {
                area=height[i]*(j-i);
                if(max<area)
                {
                    max=area;
                }
                i++;
            }
        }
        return max;
    }

}
