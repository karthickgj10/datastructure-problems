package com.karthickgj;

public class MiddleOfLL {

    public ListNode findMiddle(ListNode head) {

        if(head == null) {
            return null;
        }

        if(head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(slow.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        ListNode temp = new ListNode(30);
        list.add(new ListNode(10));
        list.add(new ListNode(20));
        list.add(temp);
        list.add(new ListNode(40));
        list.add(new ListNode(50));
        list.add( new ListNode(60));
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        System.out.println(linkedListCycle.hasCycle(list.getHead()));
        System.out.println(linkedListCycle.getLengthOfCycle(list.getHead()));
    }
}
