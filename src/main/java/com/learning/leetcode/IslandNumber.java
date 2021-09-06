package com.learning.leetcode;

public class IslandNumber {
    public int numIslands(char[][] grid) {

        if(grid == null || grid.length == 0){
            return 0;
        }

        int rowLength = grid.length;
        int colLenght = grid[0].length;
        int numOfIslands = 0;

        for(int i = 0; i < rowLength; ++i){
            for(int j = 0; j < colLenght; ++j){
                if(grid[i][j] == '1'){
                    ++numOfIslands;
                    dfs(grid, i, j);
                }
            }
        }
        return numOfIslands;
    }

    void dfs(char[][] grid, int i, int j){

        int rowLength = grid.length;
        int colLenght = grid[0].length;

        if(i < 0 || j < 0 || i >= rowLength || j >= colLenght || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';

        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);

    }
}
