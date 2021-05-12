package com.zhouhao;

/**
 * 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 *
 *
 */
public class Question03 {
    public static void main(String[] args) {
        //Test
        int[] arr = {3,5,3,10};
        System.out.println(minCount(arr));
    }
    public static int minCount(int[] coins) {
        int count = 0;

        for (int coin : coins) {
            if (coin > 1) count += (coin/2+coin%2) ;
            if (coin == 1) count++;
        }
        return count;
    }
}
