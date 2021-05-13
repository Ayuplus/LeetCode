package com.zhouhao;

/**
 * 给你一个由不同字符组成的字符串allowed和一个字符串数组words。如果一个字符串的每一个字符都在 allowed中，就称这个字符串是 一致字符串 。
 *
 * 请你返回words数组中一致字符串 的数目。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-the-number-of-consistent-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question04 {
    public static void main(String[] args) {
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean b = true;
            char[] chars = word.toCharArray();
            for (char c : chars) {
                if (!allowed.contains(String.valueOf(c))) {
                    b = false;
                    break;
                }
            }
            if (b) {
                count++;
            }
        }
        return count;
    }
}
