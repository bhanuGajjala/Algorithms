package com.learning.java8features;

public class FunctionalInterfaceDemo {


    public static void main(String[] args) {
        Addition addition = (Object i, Object j) -> (Integer)i + (Integer)j;

        System.out.println(addition.execute(3, 4));
    }

}
