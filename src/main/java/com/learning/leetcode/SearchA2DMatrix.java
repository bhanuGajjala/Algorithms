package com.learning.leetcode;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int start = 0;
        int end = rowLength * colLength - 1;

        while(start <= end){

            int mid = (end - start)/2 + start;
            int row = mid / colLength;
            int col = mid % colLength;

            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                start++;
            }else{
                end--;
            }

        }
        return false;
    }
}
