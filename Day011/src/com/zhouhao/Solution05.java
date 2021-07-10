package com.zhouhao;

/**
 * @author wangzhouhao
 * @date 2021/6/27
 */
public class Solution05 {
    public static void main(String[] args) {
        int[] arr = {5,2,2,2,5,5,4};
        int i = singleNumber(arr);
        System.out.println("i = " + i);
    }
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i ++) {
            for (int j = 0; j < nums.length; j++) {
                if ( j == nums.length-1 ){
                    return nums[i];
                }
                if ( i == j ){
                    continue;
                }
                if ( nums[i] == nums[j] ){
                    break;
                }

            }
        }
        return 0;
    }
}
