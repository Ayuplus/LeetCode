package com.zhouhao.question;
/*
字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2,
该函数将返回左旋转两位得到的结果"cdefgab"。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question05 {
    public static void main(String[] args) {
        String s = "abcdefgsdasd";
        System.out.println(reverseLeftWords(s,6));
    }
    public static String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        String srt1 = null;
        String str2 = null;
        char[] chars1=new char[chars.length-n];
        char[] chars2=new char[n];
        for (int i = 0; i < chars.length; i++) {
            if (i>=n){
                chars1[i-n]=chars[i];
            }else {
                chars2[i]=chars[i];
            }
        }
        srt1 = String.valueOf(chars1);
        str2 = String.valueOf(chars2);
        return srt1+str2;
    }
}
