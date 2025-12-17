package com.karthickgj;

public class MaxSumSubArray {

    public static int findMaxSumSubArray(int k, int[] a) {
        if(a == null || a.length == 0) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;

        while(start <= a.length - k) {

            sum = sum + a[end];
            if( end - start + 1 >= k) {
                max = Math.max(max, sum);
                sum -= a[start];
                start++;
            }
            end++;
        }
        return max;

    }

    public static void main(String[] args) {
        int a[] = {2, 1, 5, 1, 3, 2};
        findMaxSumSubArray(3, a);

    }

}
