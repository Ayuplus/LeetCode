package com.zhouhao;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 */
public class Question04 {
    public static void main(String[] args) {
        intersection(new int[]{1,2,2,1}, new int[]{2,2});
    }
    public static void intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> counts = new HashMap<>();
        for (int i : nums1) {
            if (counts.containsKey(i)){
                continue;
            }
            counts.put(i,1);
        }
        int[] arr = new int[nums1.length];
        int count = 0;
        for (int num : nums2) {
            if (counts.containsKey(num) && counts.get(num) > 0){
                int val = counts.get(num);
                arr[count] = num;
                count++;
                counts.put(num,--val);
            }
        }
        int[] ints = Arrays.copyOf(arr,count);
        System.out.println(Arrays.toString(ints));
    }
}
