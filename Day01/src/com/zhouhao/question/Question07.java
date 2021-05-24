package com.zhouhao.question;

import java.util.Arrays;

/*
给你一个 m x n 的整数网格 accounts ，其中 accounts[i][j] 是第 i 位客户在第 j 家银行托管的资产数量。
返回最富有客户所拥有的 资产总量 。客户的 资产总量 就是他们在各家银行托管的资产数量之和。最富有客户就是 资产总量 最大的客户。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/richest-customer-wealth
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question07 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3,7,4},{1,2,20,3,4},{1,5,7}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int assets = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
                if (sum > assets)
                    assets=sum;
            }
        }
        return assets;
    }
}
