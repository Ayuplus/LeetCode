package com.zhouhao;

import java.util.ArrayList;

public class Problem03 {
    public static void main(String[] args) {
        int i = removeElement(new int[]{3, 2, 2, 3}, 3);
    }
    public static int removeElement(int[] nums, int val) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (num == val) {
                continue;
            }
            list.add(num);
        }

        return list.size();
    }
}
