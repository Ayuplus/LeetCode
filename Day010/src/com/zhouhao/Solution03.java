package com.zhouhao;

/**
 * @author wangzhouhao
 * @date 2021/6/15
 */
public class Solution03 {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ( chars[i] >= 65 && chars[i] <= 90){
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
