package com.zhouhao.question;
/*
给定字符串J代表石头中宝石的类型，和字符串S代表你拥有的石头。中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。

J中的字母不重复，J和S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/jewels-and-stones
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question03 {
    public static void main(String[] args) {
        String J = "aA",S = "aAAbbbb";
        System.out.println("numJewelsInStones(J,S) = " + numJewelsInStones(J, S));
    }
    public static int numJewelsInStones(String jewels, String stones) {
        char[] chars1 = jewels.toCharArray();
        char[] chars2 = stones.toCharArray();
        int count=0;
        for (char c: chars1) {
            for (char cc:chars2) {
                if (c==cc) count++;
            }
        }
        return count;
    }
}
