package com.zhouhao;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 */
public class Question02 {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode newHead = null;
        while(temp != null){
            ListNode next = temp.next;
            /**
             * 第一次temp.next值为null,之后每次的值都是上次的temp
             */
            temp.next = newHead;
            newHead = temp;

            temp = next;
        }
        return newHead.next;
    }
}
