package com.zhouhao;
/**
 *
 * 给你一个单链表的引用结点head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question01 {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        StringBuilder s = new StringBuilder();
        while(temp != null){
            s.append(temp.val);
            temp = temp.next;
        }
        return Integer.parseInt(s.toString(),2);
    }
}


