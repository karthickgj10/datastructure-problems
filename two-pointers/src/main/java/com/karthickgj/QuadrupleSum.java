package com.karthickgj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuadrupleSum {

    public List<List<Integer>> searchQuadruplets(int[] arr, int target) {
        List<List<Integer>> quadruplets = new ArrayList<>();

        if(arr == null || arr.length < 4){
            return quadruplets;
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 3; i++) {
            if(i > 0 && arr[i-1] == arr[i]) {
                continue;
            }
            int tripletTarget = target - arr[i];
            for(int j = i + 1; j < arr.length - 2; j++) {
                if(j > i + 1 && arr[j] == arr[j-1]) {
                    continue;
                }
                int twoTarget = tripletTarget - arr[j];
                int left = j + 1;
                int right = arr.length - 1;
                while(left < right) {
                    if(arr[left] + arr[right] < twoTarget) {
                        left++;
                    } else if(arr[left] + arr[right] > twoTarget){
                        right--;
                    } else {
                        List<Integer> result = new ArrayList<>();
                        result.add(arr[i]);
                        result.add(arr[j]);
                        result.add(arr[left]);
                        result.add(arr[right]);
                        quadruplets.add(result);
                        left++;
                        right--;
                        while(left < right && arr[left] == arr[left - 1]){
                            left++;
                        }
                        while(left < right && arr[right] == arr[right + 1]){
                            right--;
                        }
                    }
                }
            }
        }
        return quadruplets;
    }

    public static void main(String[] args) {
        int arr[] = {4, 1, 2, -1, 1, -3};
        QuadrupleSum qs = new QuadrupleSum();
        qs.searchQuadruplets(arr, 1);
    }

}
