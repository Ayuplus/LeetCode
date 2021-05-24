package com.zhouhao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *一个 句子指的是一个序列的单词用单个空格连接起来，且开头和结尾没有任何空格。每个单词都只包含小写或大写英文字母。
 *
 * 我们可以给一个句子添加 从 1 开始的单词位置索引 ，并且将句子中所有单词打乱顺序。
 *
 * 比方说，句子"This is a sentence"可以被打乱顺序得到"sentence4 a3 is2 This1"或者"is2 sentence4 This1 a3"。
 * 给你一个 打乱顺序的句子s，它包含的单词不超过9个，请你重新构造并得到原本顺序的句子。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sorting-the-sentence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处
 */
public class Question02 {
    public static void main(String[] args) {
        sortSentence("is2 sentence4 This1 a3");
    }
    public static void sortSentence(String s) {
        //"is2 sentence4 This1 a3"
        String[] words = s.split(" ");
        //存储单词的容器
        String[] sentence = new String[words.length];
        //以数字为下标存储单词
        for (String word : words) {
            sentence[word.charAt(word.length()-1) -49] = word.substring(0, word.length()-1);
        }
        //建立字符串缓冲区
        StringBuilder sbn = new StringBuilder();
        for (int i = 0; i < sentence.length; i++) {
            sbn.append(sentence[i]);
            if (i < sentence.length-1)
            sbn.append(" ");
        }
        System.out.println(sbn);
    }
}
