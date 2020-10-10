package com.learning.patterns.binarysearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindNumberInShiftedArrayTest {

    FindNumberInShiftedArray findNumberInShiftedArray;

    @BeforeEach
    public void setUp() {
        findNumberInShiftedArray = new FindNumberInShiftedArray();
    }

    @Test
    public void findNumberInShiftedArrayTest() {
        int arr[] = {6, 7, 8, 1, 2, 3, 4, 5};
        int target = 2;
        int actual = findNumberInShiftedArray.findNumberInShiftedArray(arr, target);
        Assertions.assertEquals(4, actual);
    }

    @Test
    public void findNumberInShiftedArrayTest_emptyArray() {
        int arr[] = {};
        int target = 10;
        int actual = findNumberInShiftedArray.findNumberInShiftedArray(arr, target);
        Assertions.assertEquals(-1, actual);
    }

}