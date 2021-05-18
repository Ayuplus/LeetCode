package com.zhouhao;

/**
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class Question03 {
    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        int size = 0;
        while(temp1 != null){
            size++;
            temp1 = temp1.next;
        }
        for(int i = 0; i< size/2;i++){
            temp2 = temp2.next;
        }
        return temp2;
    }

    public ListNode middleNodePlus(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 0; i< size/2;i++){
            temp = temp.next;
        }
        return temp;
    }

    public ListNode middleNode2(ListNode head) {
        ListNode[] arr = new ListNode[100];
        int size = 0;
        while(head != null){
            arr[size++] = head;
            head = head.next;
        }
        return arr[size/2];
    }
}
