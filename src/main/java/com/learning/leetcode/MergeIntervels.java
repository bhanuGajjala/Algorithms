package com.learning.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervels {


    public static int[][] mergeIntervels(int[][] intervels){

        Arrays.sort(intervels, (a, b) -> a[0] - b[0]);
        List list = new ArrayList();

        int start = intervels[0][0];
        int end = intervels[0][1];

        for(int i = 1; i < intervels.length; i++){

            if(end <= intervels[i][0]){
                list.add(new int[]{start, end});
                start = intervels[i][0];
                end = intervels[i][1];
            } else if(end <= intervels[i][1]){
                end = intervels[i][1];
            }
        }

        list.add(new int[]{start, end});

        int[][] output = new int[list.size()][2];

        for(int i=0; i< list.size(); i++){
            output[i] = (int[])list.get(i);
        }

        return output;

    }

    public static void main(String[] args) {

        int[][] input = {{1,3}, {2,4}, {5,7}, {6,8}};

        System.out.println(mergeIntervels(input));

    }
}
