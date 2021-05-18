package com.zhouhao;

/**
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * 返回删除后的链表的头节点。
 */
public class Question06 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode temp = newHead;
        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
                break;
            }
        }
        return newHead.next;
    }
}
