package com.zhouhao;

/**
 * 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 *
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。
 *              0  n  0+2  n+2  0+4  n+4  0+6  n+6  0+2*
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shuffle-the-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question02 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int[] shuffle = shuffle(arr, 3);
        for (int i : shuffle) {
            System.out.print(i);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        for (int i = 0; i < nums.length; i++) {
            if (i < n ){
                arr[2*i] = nums[i];
            }else {
                arr[2*(i-n)+1] = nums[i];
            }

        }
        return arr;
    }
}
