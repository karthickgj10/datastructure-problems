package com.karthickgj;

public class FindMinSubArray {
    //Smallest Subarray With a Greater Sum
    public int findMinSubArray(int S, int[] arr) {

        if(arr == null || arr.length == 0){
            return -1;
        }

        int windowStart = 0;
        int sum = 0;
        int minSize = Integer.MAX_VALUE;
        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum = sum + arr[windowEnd];
            while(sum >= S) {
                minSize = Math.min(minSize, windowEnd - windowStart + 1);
                sum = sum - arr[windowStart];
                windowStart++;
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int S = 7;
        FindMinSubArray obj = new FindMinSubArray();
        obj.findMinSubArray(S, arr);
    }
}
