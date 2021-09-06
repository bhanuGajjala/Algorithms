package com.learning.algorithms.arrays.dailycodingproblem.easy;


/*
* This problem was asked by Google.

A girl is walking along an apple orchard with a bag in each hand. She likes to pick apples from each tree as she goes along, but is meticulous about not putting different kinds of apples in the same bag.

Given an input describing the types of apples she will pass on her path, in order, determine the length of the longest portion of her path that consists of just two types of apple trees.

For example, given the input [2, 1, 2, 3, 3, 1, 3, 5], the longest portion will involve types 1 and 3, with a length of four.
*
* */
public class Problem298 {


    private static int longPath(int[] input){

        int a = input[0];
        int b = input[1];

        int last_index_picked = b;
        int last_picked_count = (a==b)?1:0;

        int current = 1;
        int max_length = 1;

        for(int in = 1; in < input.length; in++){

            if(a != input[in] && b != input[in]){

                a = last_index_picked;
                b = input[in];
                last_index_picked = input[in];
                current = last_picked_count + 1;
            }else{
                current++;
                if(last_index_picked == input[in]){
                    last_picked_count++;
                }else{
                    last_index_picked = input[in];
                    last_picked_count = 1;
                }
            }
            max_length = Math.max(current, max_length);

        }

        return max_length;
    }

    public static void main(String[] args) {

        int input[] = {2, 1, 2, 3, 3, 1, 3, 5};

       int output = longPath(input);

        System.out.println(output);

    }
}
