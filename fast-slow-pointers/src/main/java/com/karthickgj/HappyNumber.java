package com.karthickgj;

public class HappyNumber {

    public boolean find(int num) {
        if(num == 0) {
            return false;
        }

        int slow = computeSquareSum(num);
        int fast = computeSquareSum(computeSquareSum(num));
        if(slow == 1 || fast == 1) {
            return true;
        }

        while(slow != fast) {
            slow = computeSquareSum(slow);
            fast = computeSquareSum(computeSquareSum(fast));
            if(fast == 1) {
                return true;
            }
        }
        return false;
    }

    public int computeSquareSum(int n) {
        //12
        int squareSum = 0;
        while(n!=0) {
            squareSum += (n%10) * (n%10);
            n /= 10;
        }
        return squareSum;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        happyNumber.find(1);
    }
}
