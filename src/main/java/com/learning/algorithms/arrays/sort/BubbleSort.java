package com.learning.algorithms.arrays.sort;

public class BubbleSort {

    public void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    public void bubbleSortWhile(int[] arr) {

        boolean isSorted = false;

        int length = arr.length - 1;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < length; i++) {

                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    isSorted = false;
                }
            }
            length--;
        }


    }

    public void swap(int[] arr, int low, int high) {

        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

    }
}
