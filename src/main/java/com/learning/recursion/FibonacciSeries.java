package com.learning.recursion;

public class FibonacciSeries {

    public int fib(int input){

        if(input == 1){
            return 1;
        }

        return input * fib(input-1);

    }

    public int add(int input){

        if(input == 1){
            return 1;
        }

        return input + add(input -1);

    }

    public int addNumbers(int x, int y) {
        if(x == 0)
            return y;
        else
            return addNumbers(x - 1,  x + y);
    }
}
