package com.zhouhao.question;

/**
 * 给你两个整数，n 和 start 。
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xor-operation-in-an-array
 */
public class Question01 {
    public static void main(String[] args) {
        Question01.xorOperation02(1,7);
    }


    public static void xorOperation(int n, int start) {
        int[] arr = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = start+2*i;
            result  ^= arr[i];
        }
        System.out.println(result);
    }
    public static void xorOperation02(int n, int start) {
        int[] arr = new int[n];
        int result = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = start+2*i;
            result = arr[0];
            if (i>0) result  ^= arr[i];
        }
        System.out.println(result);
    }
}
