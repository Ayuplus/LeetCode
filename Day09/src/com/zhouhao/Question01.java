package com.zhouhao;

public class Question01 {
    public boolean isPalindrome(int x) {
        String str = x + "";
        int min = 0;
        int max = str.length()-1;
        while ( min < max){
            if ( str.charAt(min) != str.charAt(max) ){
                return false;
            }
            min++;
            max--;
        }
        return true;
    }
}
