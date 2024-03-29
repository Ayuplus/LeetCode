package com.zhouhao;

/**
 * 合并有序链表
 * @author wangzhouhao
 * @date 2021/6/27
 */
public class Solution07 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       ListNode head = new ListNode(0);
       ListNode temp = head;
       while ( l1 != null && l2 != null ){
            if ( l1.val <= l2.val ){
                temp.next = l1;
                l1 = l1.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
       }
        temp.next = (l1 == null? l2 : l1);
       return head.next;
    }
}
