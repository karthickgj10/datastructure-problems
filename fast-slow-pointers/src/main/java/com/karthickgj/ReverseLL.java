package com.karthickgj;

public class ReverseLL {

    ListNode reverseLinkedList(ListNode current) {
        //1->2->3->null
        ListNode prev = null;
        ListNode temp = null;
        while(current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
