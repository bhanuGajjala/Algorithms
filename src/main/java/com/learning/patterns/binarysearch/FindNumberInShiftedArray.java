package com.learning.patterns.binarysearch;

public class FindNumberInShiftedArray {

    public int findNumberInShiftedArray(int arr[], int target){

        if(arr == null || arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] >= arr[start]){
                if(target >= arr[start] && target < arr[mid]){
                    end = mid-1;
                }else{
                    start = mid + 1;
                }
            } else {
                if(target <= arr[end] && target > arr[mid]){
                    start = mid+1;
                }
                end = mid - 1;
            }
        }
        return -1;
    }
}
