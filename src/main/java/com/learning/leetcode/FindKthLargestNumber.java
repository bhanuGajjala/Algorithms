package com.learning.leetcode;

public class FindKthLargestNumber {

    public static int[] findKLargest(int[] arr, int k){
        int length = arr.length;

        if(length <= k){
            int[] result = new int[k];
            for(int i=0; i<k; i++){
                buildMaxHeap(arr, length);
                result[i] = arr[0];
                arr[0] = arr[--length];
            }
            return result;
        }
        return arr;
    }

    private static void buildMaxHeap(int[] arr, int length) {

        for (int i = (length - 1) / 2; i >= 0; i--) {
            maxHeapify(arr, i, length);
        }
    }
    private static void maxHeapify(int[] arr, int index, int length) {
        int largest = index;

        while (largest < length / 2) {
            int left = (2 * index) + 1;
            int right = (2 * index) + 2;
            if (left < length && arr[left] > arr[index]) {
                largest = left;
            }

            if (right < length && arr[right] > arr[largest]) {
                largest = right;
            }

            if (largest != index) {
                int temp = arr[index];
                arr[index] = arr[largest];
                arr[largest] = temp;
                index = largest;
            } else {
                break;
            }
        }
    }
}
