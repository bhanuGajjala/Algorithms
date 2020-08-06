package com.learning.patterns.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class FindLongestSubstringKDistinct {

    public static int findLength(String str, int k) {

        int maxLenght = Integer.MIN_VALUE;
        int windowStart = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            while(map.size() > k){
                char leftChar = str.charAt(windowStart);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                windowStart++;
            }

            maxLenght = Math.max(maxLenght, windowEnd - windowStart + 1);

        }

        return maxLenght;
    }

    public static void main(String[] args) {
        System.out.println("Length of the longest substring: " + FindLongestSubstringKDistinct.findLength("araaci", 2));
        System.out.println("Length of the longest substring: " + FindLongestSubstringKDistinct.findLength("araaci", 1));
        System.out.println("Length of the longest substring: " + FindLongestSubstringKDistinct.findLength("cbbebi", 3));
    }
}
