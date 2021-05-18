package com.zhouhao;

/**
 *
 * 给你两个字符串数组 word1 和 word2 。如果两个数组表示的字符串相同，返回 true ；否则，返回 false 。
 *
 * 数组表示的字符串是由数组中的所有元素 按顺序 连接形成的字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-two-string-arrays-are-equivalent
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author wzh
 */
public class Question01 {
    public static void main(String[] args) {
        System.out.println(arrayStringsAreEqual2(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for (String s : word1) {
            s1 += s;
        }
        for (String s : word2) {
            s2 += s;
        }
        return s1.equals(s2);
    }
    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
