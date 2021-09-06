package com.learning.leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {

    public static String minRemoveToMakeValid(String s) {

        Set<Integer> removeIndex = new HashSet<>();
        Stack<Integer> stack = new Stack();


        StringBuilder output = new StringBuilder();

        for(int i = 0; i < s.length(); i++){

            char current = s.charAt(i);
            if(current == '('){
                stack.push(i);
            } if(current == ')') {
                if(stack.isEmpty()){
                    removeIndex.add(i);
                }else{
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty()){
            removeIndex.add(stack.pop());
        }
        for (int i = 0; i < s.length(); i++) {
            if (!removeIndex.contains(i)) {
                output.append(s.charAt(i));
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";

        System.out.println(minRemoveToMakeValid(s));
    }
}
