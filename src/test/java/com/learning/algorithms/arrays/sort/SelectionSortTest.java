package com.learning.algorithms.arrays.sort;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SelectionSortTest {

    SelectionSort selectionSort;

    @BeforeEach
    public void setUp(){
        selectionSort = new SelectionSort();
    }

    @Test
    public void testSelectionSort(){

        int[] arr = new int[]{6, 3, 4, 2, 5, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};

        selectionSort.selectionSort(arr);

        Assertions.assertTrue(Arrays.equals(arr, expected));
    }

}