package com.learning.leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String input){

        Stack stack = new Stack();

        for(int i = 0; i< input.length(); i++){
            char current = input.charAt(i);

            if(current == '{' || current == '[' || current == '('){
                stack.push(current);
            } else {

                char open = (char)stack.peek();
                if(open == '{' && current == '}'){
                    stack.pop();
                } else if(open == '[' && current == ']'){
                    stack.pop();
                }else if(open == '(' && current == ')'){
                    stack.pop();
                }

            }

            if(stack.isEmpty()){
                return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }
}
