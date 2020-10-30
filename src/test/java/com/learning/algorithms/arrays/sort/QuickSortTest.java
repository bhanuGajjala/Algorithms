package com.learning.algorithms.arrays.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class QuickSortTest {

    QuickSort quickSort;

    @BeforeEach
    public void setUp(){
        quickSort = new QuickSort();
    }

    @Test
    public void testQuickSortWithMid(){
        int arr[] = {10, 7, 8, 9, 1, 5};
        int expected[] = {1, 5, 7, 8, 9, 10};

        quickSort.quickSortWithMid(arr, 0, arr.length-1);

        Assertions.assertTrue(Arrays.equals(arr, expected));

    }

    @Test
    public void testQuickSort(){
        int arr[] = {10, 7, 8, 9, 1, 5};
        int expected[] = {1, 5, 7, 8, 9, 10};

        quickSort.quickSort(arr, 0, arr.length-1);

        Assertions.assertTrue(Arrays.equals(arr, expected));

    }

}