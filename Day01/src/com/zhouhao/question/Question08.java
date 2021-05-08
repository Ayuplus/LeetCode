package com.zhouhao.question;
/*
给你一个整数数组 nums 。
如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
返回好数对的数目。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/number-of-good-pairs
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
1 2 3 4 5
0 1 3 6 10
 */
public class Question08 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};//示例
        System.out.println(numIdenticalPairs(arr));
    }
    public static  int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] temp = new int[100];
        /*
        从前面开始遍历nums
        假设nums = [1,2,3,1,1,3]
        第一遍
        temp是[0,0,0,0]
        ans+=0; //temp[0]
        temp[0]++;

        第二遍
        temp是[1,0,0,0]
        ans+=0; //temp[1]
        temp[1]++;

        第三遍
        temp=[1,1,0,0]
        ans+=0;  //temp[2]
        temp[2]++;

        第四遍
        temp=[1,1,1,0]
        ans+=1;  //temp[0]
        temp[0]++;

        第五遍
        temp=[2,1,1,0]
        ans+=3;  //temp[0]
        temp[0]++;

        第六遍
        temp=[3,1,1,0]
        ans+=4;  //3+temp[2]
        temp[2]++;
        */
        for (int num : nums) {
            ans += temp[num - 1]++;
        }
        return ans;
    }
}
