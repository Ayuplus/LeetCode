package com.zhouhao;

/**
 *给你一个下标从 0开始的字符串 s，它的 偶数 下标处为小写英文字母，奇数下标处为数字。
 * 定义一个函数shift(c, x)，其中c是一个字符且x是一个数字，函数返回字母表中c后面第 x个字符。
 * 比方说，shift('a', 5) = 'f'和shift('x', 0) = 'x'。
 * 对于每个 奇数下标i，你需要将数字s[i] 用shift(s[i-1], s[i])替换。
 * 请你替换所有数字以后，将字符串 s返回。题目 保证shift(s[i-1], s[i])不会超过 'z'。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/replace-all-digits-with-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question06 {
    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
    }
    public static String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' &&  chars[i] <='9'){
                chars[i] = (char) (chars[i-1]+ (chars[i]-48));
            }
        }
        return new String(chars);
    }
}
