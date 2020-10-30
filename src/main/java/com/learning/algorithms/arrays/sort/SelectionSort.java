package com.learning.algorithms.arrays.sort;

public class SelectionSort {

    public void selectionSort(int[] arr){


        for(int i=0; i< arr.length; i++){
            int minIdx = i;
            for(int j= i; j<arr.length; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            swap(arr, minIdx, i);
        }
    }

    public void swap(int[] arr, int low, int high) {

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

    }
}
