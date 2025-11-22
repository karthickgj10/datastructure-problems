package com.karthickgj;

import javax.crypto.Mac;

public class MinimumWindowSort {

    public static int sort(int[] arr) {

        if(arr == null || arr.length == 0) {
            return -1;
        }

        if(arr.length == 1) {
            return 0;
        }

        int left = 0;
        int right = arr.length - 1;
        int i = left + 1;
        int j = right - 1;

        while (i <= j) {
            if(arr[i] > arr[left] && arr[right] > arr[i]) {
                left++;
                i++;
            } else if(arr[j] < arr[right] && arr[left] < arr[j]) {
                right--;
                j--;
            } else {
                return right - left + 1;
            }
        }

        return 0;
    }

    //efficient approach
    public static int efficientSort(int[] arr) {
        if(arr == null || arr.length == 0) {
            return -1;
        }
        if(arr.length == 1) {
            return 0;
        }
        int left = 0;
        int right = arr.length - 1;

        while(left < arr.length - 1) {
            if(arr[left] < arr[left + 1]) {
                left++;
            }
        }
        if(left == arr.length-1) {
            return 0;
        }

        while(right > 0) {
            if(arr[right] > arr[right - 1]) {
                right--;
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =  left; i <= right; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        while(left > 0 && arr[left-1] > min) {
            left--;
        }

        while(right < arr.length - 1 && arr[right+1] < max) {
            right++;
        }
        return right - left + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(sort(arr));
    }
}
