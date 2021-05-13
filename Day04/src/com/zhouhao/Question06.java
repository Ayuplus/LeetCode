package com.zhouhao;

/**
 * 全字母句 指包含英语字母表中每个字母至少一次的句子。
 * 给你一个仅由小写英文字母组成的字符串 sentence ，请你判断sentence 是否为 全字母句 。
 * 如果是，返回 true ；否则，返回 false 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-the-sentence-is-pangram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question06 {
    public static void main(String[] args) {
        System.out.println(test("thequickbrown"));
    }
    public static boolean test(String s){
        //数组计数器
        int[] arr = new int[26];
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c>=97 && c <= 122) arr[c-97]++;
        }
        for (int i : arr) {
            if (i == 0) return false;
        }
        return true;
    }
}
