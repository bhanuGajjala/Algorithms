package com.learning.patterns.twopointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;


class PairWithTargetSumTest {

    PairWithTargetSum pairWithTargetSum;

    @BeforeEach
    public void setUp() {
        pairWithTargetSum = new PairWithTargetSum();
    }


    @ParameterizedTest
    @MethodSource("intputArrayTargetSumOutArrayProvider")
    public void findSumPairTest(int[] input, int target, int[] output) {

        int[] actualOutput = pairWithTargetSum.findSumPair(input, target);

        Assertions.assertEquals(output[0], actualOutput[0]);
        Assertions.assertEquals(output[1], actualOutput[1]);

    }

    @ParameterizedTest
    @MethodSource("intputArrayTargetSumOutArrayProvider")
    public void findSumPairUnsortedArray(int[] input, int target, int[] output) {

        int[] actualOutput = pairWithTargetSum.findSumPairUnsortedArray(input, target);

        Assertions.assertEquals(output[0], actualOutput[0]);
        Assertions.assertEquals(output[1], actualOutput[1]);

    }

    static Stream<Arguments> intputArrayTargetSumOutArrayProvider() {
        return Stream.of(
                arguments(new int[]{1, 2, 3, 4, 6}, 6, new int[]{1, 3}),
                arguments(new int[]{2, 5, 9, 11}, 11, new int[]{0, 2})
        );
    }

}