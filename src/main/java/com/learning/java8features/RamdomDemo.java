package com.learning.java8features;

import java.util.Random;
import java.util.RandomAccess;

public class RamdomDemo {

    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 0; i <= 10; i++){
            System.out.println(random.nextInt(8) + 1);
        }
    }
}

/*
*
* Generate numbers Utils
*
*  NumberOperations
*  add
*  sub
*  multiple
*  divide
*
* FisrtGrade extends NumberOperations
* SecondGrade extends NumberOperations
*
*
* Controller
*
*
* Get paper requestUrl: localhost:8080/practicepaper/{grade}
* Get paper response : { "class" : "FirstGrade", "questions":["question":{"value1": 1, "value2": 2}] }
*
* Post paper request: { "class" : "FirstGrade", "questions":["question":{"value1": 1, "value2": 2, "answer": 3, "ignoreInResult": 0}] }
*
* check answer request : {"value1":1, "value2": 2, "answer": 3}
*
*
*
*
*
* AdditionController{
*
*  FirstGrade firstGrade;
*
*
*
* }
*
*
*
*
*
* */