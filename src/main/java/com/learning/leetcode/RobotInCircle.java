package com.learning.leetcode;

//https://thefellowprogrammer.blogspot.com/2020/09/robot-bounded-in-circle.html
public class RobotInCircle {

    public static boolean isRobotBounded(String instructions) {

        int x = 0, y = 0;
        int i = 0;
        int directions[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        for(int j = 0; j < instructions.length(); j++){
            if(instructions.charAt(j) == 'R'){
                i = (i + 1) % 4;
            }else if(instructions.charAt(j) == 'L'){
                i = (i + 3) % 4;
            } else {
                x += directions[i][0];
                y += directions[i][1];
            }
        }
        return x == 0 && y == 0 || i > 0;
    }

    public static void main(String[] args) {

        String input = "GGLLGG";
        isRobotBounded(input);
    }
}
