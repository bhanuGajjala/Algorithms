package com.learning.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

class RemoveEvenIntegersTest {

    RemoveEvenIntegers removeEvenIntegers;

    @BeforeEach
    public void setUp() {
        removeEvenIntegers = new RemoveEvenIntegers();
    }

    @Test
    public void removeEvenIntegersTest() {

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] expected = {2, 4, 6, 8};

        int[] output = removeEvenIntegers.removeEvenIntegers(input);

        Assertions.assertAll(() -> Assertions.assertEquals(expected.length, output.length),
                             () -> Assertions.assertTrue(Arrays.equals(expected, output)));
    }

    @ParameterizedTest(name = "input {0} = output {1}")
    @MethodSource("oddArrayInputData")
    /*@CsvSource({
            "[1, 2, 3, 4, 5, 6, 7, 8], [1, 3, 5, 7]",
            "[1, 2, 3, 4, 5, 6, 7, 8], [1, 3, 5, 7]",
            "[1, 2, 3, 4, 5, 6, 7, 8], [1, 3, 5, 7]",
            "[1, 2, 3, 4, 5, 6, 7, 8], [1, 3, 5, 7]",
            "[1, 2, 3, 4, 5, 6, 7, 8], [1, 3, 5, 7]"
    })*/
    public void removeOddIntegersTest(int[] input, int[] expected) {

        int[] output = removeEvenIntegers.removeOddIntegers(input);

        Assertions.assertEquals(expected.length, output.length);
        Assertions.assertTrue(Arrays.equals(expected, output));

    }

    static Stream<Arguments> oddArrayInputData() {

        return Stream.of(arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{1, 3, 5, 7}),
                arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, new int[]{1, 3, 5, 7}),
                arguments(new int[]{1, 2, 3, 5, 6, 7, 8}, new int[]{1, 3, 5, 7}),
                arguments(new int[]{1, 2, 3, 4, 5, 7, 8}, new int[]{1, 3, 5, 7}),
                arguments(new int[]{1, 2, 3, 4, 5, 6, 7}, new int[]{1, 3, 5, 7})
        );

    }

}