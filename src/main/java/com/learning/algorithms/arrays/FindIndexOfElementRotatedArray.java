package com.learning.algorithms.arrays;

// input = [4,5,6,7,0,1,2,3] target = 1

public class FindIndexOfElementRotatedArray {

    public int findIndex(int[] input, int value){

        int left = 0;
        int right = input.length - 1;
        int pivot = (left + right)/2;
        int output = findPivot(input, left, right, value);
        return output;

    }

    public int findPivot(int[] input, int left, int right, int value){

        if(left > right){
            return -1;
        }

        int pivot = (left + right)/2;

        if(input[pivot] == value){
            return pivot;
        } else if (input[left] <= value && input[pivot] >= value){
            return findPivot(input, left, pivot-1, value);
        }else if(input[right] >= value && input[pivot] >= value){
            return findPivot(input,pivot+1, right, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        FindIndexOfElementRotatedArray f = new FindIndexOfElementRotatedArray();
        int[] input = {4,5,6,7,0,1,2,3};
        int target = 0;
        int output = f.findIndex(input, target);
        System.out.println(output);
    }
}
