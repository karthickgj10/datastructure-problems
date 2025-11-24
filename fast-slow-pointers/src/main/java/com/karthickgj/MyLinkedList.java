package com.karthickgj;

public class MyLinkedList {
    private ListNode head;

    public ListNode add(ListNode node) {
        if(head == null) {
            head = node;
        } else {
            ListNode temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        return head;
    }

    public ListNode getHead() {
        return head;
    }
}
