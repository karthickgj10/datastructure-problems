package com.karthickgj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {

    public static List<List<Integer>> searchTriplets(int[] arr) {
        if(arr == null || arr.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0;  i < arr.length - 2 ; i++) {
            if(i != 0 && arr[i] == arr[i-1]) {
                continue;
            }
            int target  = -arr[i];
            int left = i + 1;
            int right = arr.length - 1;
            while(left < right){
                if(arr[left] + arr[right] > target){
                    right--;
                } else if(arr[left] + arr[right] < target){
                    left++;
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[left++]);
                    list.add(arr[right--]);
                    while(left < right && arr[right] == arr[right + 1]){
                        right--;
                    }
                    while(left < right && arr[left] == arr[left - 1]){
                        left++;
                    }
                    result.add(list);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-3, 0, 1, 2, -1, 1, -2};
        searchTriplets(arr);
    }
}
