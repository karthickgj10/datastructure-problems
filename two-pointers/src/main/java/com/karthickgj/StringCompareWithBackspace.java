package com.karthickgj;

public class StringCompareWithBackspace {

    public static boolean compare(String str1, String str2){
        if(str1 == null || str2 == null) {
            return false;
        }
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        while(i >= 0 && j >= 0) {
            i = getIndex(str1, i);
            j = getIndex(str2, j);
            if(i < 0 && j < 0) {
                return true;
            }
            if(i < 0 || j < 0) {
                return false;
            }
            if(str1.charAt(i) != str2.charAt(j)) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }


    private static int getIndex(String str, int index) {
        int backspaceCount = 0;
        while (index >= 0) {
            if (str.charAt(index) == '#')
                backspaceCount++;
            else if (backspaceCount > 0)
                backspaceCount--;
            else
                break;

            index--; // skip a backspace or a valid character
        }
        return index;
    }

    /*public static int getIndex(String str, int index) {
        int count = 0;
        while(index >= 0 && str.charAt(index) == '#'){
            index--;
            count++;
        }
        while(count > 0 && index > 0) {
            count--;
            index--;
        }
        return index;
    }*/

    public static void main(String[] args) {
        String str1 = "ab##";
        String str2 = "c#d#";
        compare(str1, str2);
    }


}
