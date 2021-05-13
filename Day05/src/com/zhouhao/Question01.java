package com.zhouhao;

import java.util.Arrays;

/**
 * 给你一个以行程长度编码压缩的整数列表nums。
 * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]]（其中i >= 0），每一对都表示解压后子列表中有 freq个值为val的元素，\
 * 你需要从左到右连接所有子列表以生成解压后的列表。
 * 请你返回解压后的列表。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decompress-run-length-encoded-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question01 {
    public static void main(String[] args) {
        int[] ints = decompressRLElist(new int[]{2,2,4,4,6,6});
        System.out.println(ints.length);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] decompressRLElist(int[] nums) {
        int[] arr = null;
        int count =0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i += 2) {
            count += nums[i];
        }
        int[] ints = new int[count];
        for (int i = 0; i < nums.length; i+=2) {
            arr = new int[nums[i]];
            Arrays.fill(arr,nums[i+1]);
            if (i!=0)  count2 += nums[i-2];
            System.arraycopy(arr,0,ints,count2,arr.length);
        }
        return ints;
    }
}
