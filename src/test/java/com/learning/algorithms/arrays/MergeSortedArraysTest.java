package com.learning.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;


class MergeSortedArraysTest {

    MergeSortedArrays mergeSortedArrays;


    @BeforeEach
    public void setUp(){
        mergeSortedArrays = new MergeSortedArrays();
    }

    @ParameterizedTest
    @MethodSource("mergeData")
    public void mergeSortedArraysTest(int[] inputOne, int[] inputTwo, int[] expected){

        int[] output = mergeSortedArrays.mergeArrays(inputOne,inputTwo);

        Assertions.assertAll(() -> Assertions.assertEquals(expected.length, output.length),
                () -> Assertions.assertTrue(Arrays.equals(expected, output)));

    }

    public static Stream<Arguments> mergeData(){
        return Stream.of(
                Arguments.arguments(new int[]{1,2,3}, new int[]{4,5,6}, new int[]{1,2,3,4,5,6})
        );
    }

}