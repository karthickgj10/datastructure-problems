package com.karthickgj;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKReplacement {
    //Longest Substring with Same Letters after Replacement

    public int findLength(String str, int k) {
        if(str == null || str.length() == 0) {
            return -1;
        }

        int windowStart = 0;
        int maxOcurrence = 0;
        int maxSubStrLength = 0;
        Map<Character, Integer> characterMap = new HashMap<>();
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            characterMap.put(str.charAt(windowEnd), characterMap.getOrDefault(str.charAt(windowEnd), 0) + 1);
            maxOcurrence = Math.max(maxOcurrence, characterMap.get(str.charAt(windowEnd)));
            while(windowEnd - windowStart - maxOcurrence + 1 > k) {
                maxSubStrLength = Math.max(maxSubStrLength, windowEnd - windowStart + 1);
                characterMap.put(str.charAt(windowStart), characterMap.get(str.charAt(windowStart)) - 1);
                windowStart++;
            }
        }
        return maxSubStrLength;
    }


    public int findLength1(String str, int k) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;
        int maxCharLength = 0;

        for(end = 0; end < str.length(); end++) {
            map.put(str.charAt(end), map.getOrDefault(str.charAt(end), 0) + 1);
            maxCharLength = Math.max(maxCharLength, map.get(str.charAt(end)));

            while(end - start - maxCharLength + 1 > k){
                map.put(str.charAt(start), map.get(str.charAt(start)) - 1);
                //maxCharLength = Math.max(maxCharLength, map.get(str.charAt(start)));
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);

        }


        return maxLength;
    }
}
