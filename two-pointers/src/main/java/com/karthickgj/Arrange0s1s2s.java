package com.karthickgj;

public class Arrange0s1s2s {

    public int[] sort(int[] arr) {
        if(arr == null || arr.length == 0) {
            return arr;
        }
        int left = 0;
        int right = arr.length - 1;
        for(int i = 0; i <= right;) {
            if(arr[i] == 0) {
                swap(arr, i, left);
                left++;
                i++;
            } else if(arr[i] == 2) {
                swap(arr, i, right);
                right--;
            } else {
                i++;
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 1, 0};
        Arrange0s1s2s obj = new Arrange0s1s2s();
        obj.sort(arr);
    }
}
