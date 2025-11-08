package com.karthickgj;

public class SquaringSortedArray {
    public static int[] makeSquares(int[] arr) {

        if(arr == null  || arr.length == 0) {
            return arr;
        }

        if(arr.length == 1) {
            return new int[]{arr[0] * arr[0]};
        }
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[arr.length];
        int resultIndex = result.length - 1;
        while(left <= right) {
            if(arr[left] * arr[left] > arr[right] * arr[right]) {
                result[resultIndex--] = arr[left] * arr[left];
                left++;
            } else {
                result[resultIndex--] = arr[right] * arr[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 2, 3};
        makeSquares(arr);
    }
}
