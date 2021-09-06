package com.learning.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        return Arrays.stream(points)
                .sorted(Comparator.comparingInt(xy-> xy[0]*xy[0]+xy[1]*xy[1]))
                .limit(k)
                .toArray(int[][]::new);
    }
}
