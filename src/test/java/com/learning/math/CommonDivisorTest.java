package com.learning.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonDivisorTest {

    CommonDivisor commonDivisor;

    @BeforeEach
    public void setUp() {
        commonDivisor = new CommonDivisor();
    }

    @Test
    public void testGCD(){

        System.out.println(commonDivisor.gcd(8, 4));
        System.out.println(commonDivisor.gcd(6, 7));
    }

}