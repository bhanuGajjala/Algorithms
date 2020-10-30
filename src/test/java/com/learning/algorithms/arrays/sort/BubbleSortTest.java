package com.learning.algorithms.arrays.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BubbleSortTest {

    BubbleSort bubbleSort;

    @BeforeEach
    public void setUp(){
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testBubbleSortTest(){
        int[] arr = new int[]{6, 3, 4, 2, 5, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};

        bubbleSort.bubbleSort(arr);

        Assertions.assertTrue(Arrays.equals(arr, expected));
    }

    @Test
    public void testBubbleSortWhileTest(){
        int[] arr = new int[]{6, 3, 4, 2, 5, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};

        bubbleSort.bubbleSortWhile(arr);

        Assertions.assertTrue(Arrays.equals(arr, expected));
    }

}