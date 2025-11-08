package com.karthickgj;

public class FindNonDuplicatesNumber {

    public static int moveElements(int[] arr) {
        int start = 0;
        int end = 0;
        while(end < arr.length) {
            if(arr[start] == arr[end]){
                end++;
            }else {
                start++;
                arr[start] = arr[end];
                end++;
            }
        }
        return start + 1;
    }

    public static void main(String[] args) {
       int[] arr = {2, 3, 3, 3, 6, 9, 9};
       System.out.println(moveElements(arr));
    }
}
