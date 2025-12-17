package com.karthickgj;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinctCharacters {

    public int findLength(String str, int k) {

        if(str == null || str == ""){
            return -1;
        }
        int windowStart = 0;
        Map<Character, Integer> map = new HashMap<>();
        int max = -1;
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            map.put(str.charAt(windowEnd), map.getOrDefault(str.charAt(windowEnd), 0) + 1);
            while(map.size() > k) {
                map.put(str.charAt(windowStart), map.getOrDefault(str.charAt(windowStart), 0) - 1);
                if(map.get(str.charAt(windowStart)) <= 0) {
                    map.remove(str.charAt(windowStart));
                }
                windowStart++;
            }
            max = Math.max(max, windowEnd - windowStart + 1);
        }
        return max;
    }
}
