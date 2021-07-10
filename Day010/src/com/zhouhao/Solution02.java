package com.zhouhao;

import java.util.List;

/**
 * @author wangzhouhao
 * @date 2021/6/15
 */
public class Solution02 {
    public void reverseString(char[] s) {
        int max = s.length-1;
        int min = 0;
        while ( max > min ){
            char temp = s[max];
            s[max] = s[min];
            s[min] = temp;
            max -- ;
            min ++ ;
        }
    }
}
