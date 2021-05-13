package com.zhouhao;

import java.util.Arrays;

/**
 * 给你一个数组nums，对于其中每个元素nums[i]，请你统计数组中比它小的所有数字的数目。
 * 换而言之，对于每个nums[i]你必须计算出有效的j的数量，其中 j 满足j != i 且 nums[j] < nums[i]。
 * 以数组形式返回答案。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question05 {
    public static void main(String[] args) {
        int[] ints = smallerNumbersThanCurrent(new int[]{6,5,4,8});
        System.out.println(Arrays.toString(ints));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i =0 ; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (nums[i] > num) count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}
