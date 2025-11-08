package com.karthickgj;

import java.util.Arrays;

public class TargetSum {

    public static int[] search(int[] arr, int targetSum) {
        int left = 0;
        int right = arr.length -1;
        while(left < right) {
            if(arr[left] + arr[right] == targetSum) {
                return new int[]{left, right};
            } else if(arr[left] + arr[right] > targetSum) {
                right--;
            } else {
                left++;
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = search(arr, 4);
        System.out.println(Arrays.toString(result));
    }
}
