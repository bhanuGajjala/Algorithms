package com.learning.algorithms.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

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
                output[k] = inputTwo[j];
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

    public static void mergeArrays(int[] left, int[] right, int[] input) {


        int i = 0, j = 0, k = 0;

        while(i< left.length && j < right.length){

            if(left[i] < right[j]){
                input[k] = left[i];
                k++;
                i++;
            } else {
                input[k] = right[j];
                k++;
                j++;
            }

        }

        if(i < left.length){
            while(i < left.length){
                input[k] = left[i];
                i++;
                k++;
            }
        }

        if(j < right.length){
            while(j < right.length){
                input[k] = right[j];
                j++;
                k++;
            }
        }
    }

    public int[] mergeUnSortedArrays(int[] inputOne, int[] inputTwo){

        Arrays.sort(inputOne);
        Arrays.sort(inputTwo);

        return mergeArrays(inputOne, inputTwo);

    }


    public static void mergeSort(int[] input, int size){

        if(size < 2){
            return;
        }

        int mid = size/2;

        int[] left = new int[mid];
        int[] right = new int[size - mid];


        int k = 0;
        for(int i=0; i < size; i++){

            if(i < mid){
                left[i] = input[i];
            }else{
                right[k] = input[i];
                k++;
            }

        }

        mergeSort(left, left.length);
        mergeSort(right, right.length);

        mergeArrays(left, right, input);
    }

    public Object[] mergeArraysJava8(int[] inputOne, int[] inputTwo){

        return Stream.of(inputOne, inputTwo).flatMap(Stream::of).toArray();

    }

    public static void main(String[] args) {

        int[] input = {5,4,6,3,7,2,9,8,1};
        mergeSort(input, input.length);
        System.out.println(input);


    }
}
