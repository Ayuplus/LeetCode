package com.zhouhao;

import java.util.Arrays;

/**
 * 给你一个字符串 s 和一个 长度相同 的整数数组 indices 。
 *
 * 请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。
 *
 * 返回重新排列后的字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shuffle-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question03 {
    public static void main(String[] args) {
        restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3});
    }
    public static void restoreString(String s, int[] indices) {
        char[] words = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            words[indices[i]] = s.charAt(i);
        }
        System.out.println(Arrays.toString(words));
    }
}
