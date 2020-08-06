package com.learning.patterns.slidingwindow;

public class FindAvgInContiguousSubarrays {


    // this is brute force approach, with O(range * input) time complexity
    public double[] findAvg(int[] input, int range){

        double[] results = new double[input.length - range + 1];

        for(int i =0; i <= input.length - range; i++){
            double sum = 0;
            for(int j = i; j < i+range; j++){
                sum += input[j];
            }
            results[i] = sum/range;
        }

        return results;
    }

    // this is sliding window approach.
    public double[] findAvgSW(int[] input, int range){

        double[] results = new double[input.length - range + 1];

        int windowStart = 0;

        double windowSum = 0;

        for(int windowEnd = 0; windowEnd < input.length - 1; windowEnd++){
            windowSum += input[windowEnd];
            if(windowEnd >= range-1){
                results[windowStart] =  windowSum / range;
                windowSum -= input[windowStart];
                windowStart++;
            }
        }

        return results;
    }
}
