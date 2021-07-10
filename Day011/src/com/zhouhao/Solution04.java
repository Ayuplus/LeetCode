package com.zhouhao;

/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * @author wangzhouhao
 * @date 2021/6/27
 */
public class Solution04 {
    public int[] printNumbers(int n) {
        int temp = (int) Math.pow(10, n) - 1;
        int[] arr = new int[temp];
        for (int i = 0; i < temp; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
}
