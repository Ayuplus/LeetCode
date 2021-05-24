package com.zhouhao;

import java.util.HashMap;

/**
 *  给定两个数组，编写一个函数来计算它们的交集。
 */
public class Question01 {
    public static void main(String[] args) {
        intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});

    }
    public static void intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> nums = new HashMap<>();
        for (int j : nums1) {
            if (nums.containsKey(j)) {
                int value = nums.get(j);
                nums.put(j, ++value);
            }else {
                nums.put(j, 1);
            }
        }
        int count = 0;
        int[] arr = new int[nums1.length];
        for (int i : nums2) {
            if (nums.containsKey(i) && nums.get(i) > 0){
                int val = nums.get(i);
                arr[count] = i;
                count++;
                nums.put(i,--val);
            }
        }

    }
}
