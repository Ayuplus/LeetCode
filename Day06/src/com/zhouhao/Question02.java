package com.zhouhao;
/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。(使用数据结构与算法)
 *
 * @author
 */
public class Question02 {
    public static void main(String[] args) {

    }

    public String replaceSpace(String s) {
        char[] chars = new char[s.length()*3];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' '){
                chars[size++] = '%';
                chars[size++] = '2';
                chars[size++] = '0';
            } else {
                chars[size++] = c;
            }
        }
        return new String(chars,0,size);
    }
}
