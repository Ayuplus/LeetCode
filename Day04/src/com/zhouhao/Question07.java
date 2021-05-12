package com.zhouhao;

/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 */
public class Question07 {
    public static void main(String[] args) {

    }
    public static int test(int n){
        int sum = 0;
        int mul = 1;
        while (n>0){
            sum += n%10;
            mul *= n%10;
            n = n/10;
        }
        return mul-sum;
    }
}
