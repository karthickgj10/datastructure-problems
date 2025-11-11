package com.karthickgj;

import java.util.Arrays;

public class TripletLessThanTarget {

    public static int searchTriplets(int[] arr, int target) {
        if(arr == null || arr.length < 3) {
            return 0;
        }

        Arrays.sort(arr);
        int count = 0;
        for(int i = 0; i < arr.length - 2; i++) {
            int expectedTarget = target - arr[i];
            int left = i + 1;
            int right = arr.length - 1;
            while(left < right) {
                if(arr[left] + arr[right] < expectedTarget) {
                    count += right - left;
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }

    public static  void main(String[] s) {
        int n[] = {-1, 4, 2, 1, 3};
        System.out.println(searchTriplets(n, 5 ));
    }
}
