package com.zhouhao.question;
/*
给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。

请返回 nums 的动态和。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question04 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,10,1};
        int[] nums = runningSum(arr);
        for (int num : nums) {
            System.out.println("nums[i] = " + num);
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] arr =new int[nums.length];
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            arr[i] = sum;
        }
        return arr;
    }
}
