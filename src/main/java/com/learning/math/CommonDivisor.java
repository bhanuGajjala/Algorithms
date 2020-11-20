package com.learning.math;

public class CommonDivisor {

    public int gcd(int a , int b){
        if(b == 0){
            return a;
        }
        a = a%b;
        return gcd(b, a);
    }
}
