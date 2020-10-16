package com.learning.algorithms.arrays;

public class MergeSortedArrays {


    public int[] mergeArrays(int[] inputOne, int[] inputTwo) {

        int[] output = new int[inputOne.length + inputTwo.length];

        int i = 0, j = 0, k = 0;

        while(i< inputOne.length && j < inputTwo.length){

            if(inputOne[i] < inputTwo[j]){
                output[k] = inputOne[i];
                k++;
                i++;
            } else {
                output[k] = inputOne[j];
                k++;
                j++;
            }

        }

        if(i < inputOne.length){
            while(i < inputOne.length){
                output[k] = inputOne[i];
                i++;
                k++;
            }
        }

        if(j < inputTwo.length){
            while(j < inputTwo.length){
                output[k] = inputTwo[j];
                j++;
                k++;
            }
        }

        return output;
    }
}
