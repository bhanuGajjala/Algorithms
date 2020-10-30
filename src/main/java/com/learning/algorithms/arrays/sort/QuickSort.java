package com.learning.algorithms.arrays.sort;

public class QuickSort {


    public void quickSort(int arr[], int low, int high) {


        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public int partition(int arr[], int low, int high) {

        int j = low - 1;
        for (int i = low; i < high; i++) {
            if (arr[i] < arr[high]) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[high];
        arr[high] = arr[j + 1];
        arr[j + 1] = temp;

        return j + 1;
    }


    public void quickSortWithMid(int[] arr, int low, int high){

        if(low >= high){
            return;
        }

        int mid = (low + high)/2;

        int pi = partition(arr, low, high, mid);

        quickSortWithMid(arr, low, pi-1);
        quickSortWithMid(arr, pi, high);

    }

    public int partition(int[] arr, int low, int high, int mid){

        while(low <= high){
            while(arr[low] < arr[mid]){
                low++;
            }

            while(arr[high] > arr[mid]){
                high--;
            }

            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        return low;
    }

    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.quickSortWithMid(arr, 0, n-1);
        System.out.println("");

    }

}
