package com.zhouhao;

/**
 * 反转链表
 * @author wangzhouhao
 * @date 2021/6/27
 */
public class Solution06 {
    public ListNode reverseList(ListNode head) {
        if (head.next == null)
            return head;
        ListNode newHead = null;
        ListNode temp = head;
        ListNode next = null;
        while ( temp != null ) {
            next = temp.next;
            temp.next = newHead;
            newHead = temp;
            temp = next;
        }
        return newHead;
    }
}

