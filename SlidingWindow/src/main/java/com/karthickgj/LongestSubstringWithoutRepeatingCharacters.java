package com.karthickgj;


import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int getLongestSubstringLength(String str) {
        if(str == null || str.isEmpty()) {
            return 0;
        }

        int windowStart = 0;
        int maxLen = 0;
        int[] charIndex = new int[256];
        Arrays.fill(charIndex, -1);
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char c = str.charAt(windowEnd);
            if(charIndex[c] >= windowStart) {
                windowStart = charIndex[c] + 1;
            }
            charIndex[c] = windowEnd;
            maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
        }
        return maxLen;
    }
}
