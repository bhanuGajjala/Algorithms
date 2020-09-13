package com.learning.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciSeriesTest {

    FibonacciSeries fibonacciSeries;

    @BeforeEach
    public void setUp() {
        fibonacciSeries = new FibonacciSeries();
    }

    @Test
    public void addTest() {

        int expected = 15;
        int actual = fibonacciSeries.add(5);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void addNumbersTest() {

        int expected = 17;
        int actual = fibonacciSeries.addNumbers(5, 2);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void fibTest() {

        int expected = 120;
        int actual = fibonacciSeries.fib(5);

        Assertions.assertEquals(expected, actual);
    }
}
