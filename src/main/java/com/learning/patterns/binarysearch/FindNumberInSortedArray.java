package com.learning.patterns.binarysearch;

public class FindNumberInSortedArray {

    public int findNumberInSortedArray(int arr[], int target){

        if(arr == null || arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] < target){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }
}
