package com.karthickgj;

import java.util.List;

public class LinkedListCycle {


    public boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(slow.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public ListNode getIntersectionNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return slow;
            }
        }
        return null;
    }

    public int getLengthOfCycle(ListNode head) {
        ListNode intersectingNode = getIntersectionNode(head);
        if(intersectingNode == null) {
            return 0;
        }
        int length = 0;
        ListNode temp = intersectingNode;
        while(intersectingNode.next != temp) {
            intersectingNode = intersectingNode.next;
            length++;
        }
        return length + 1;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        ListNode temp = new ListNode(30);
        list.add(new ListNode(10));
        list.add(new ListNode(20));
        list.add(temp);
        list.add(new ListNode(40));
        list.add(new ListNode(50));
        //creating cycle
        ListNode cycle = new ListNode(60);
        cycle.next = temp;
        list.add(cycle);
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        System.out.println(linkedListCycle.hasCycle(list.getHead()));
        System.out.println(linkedListCycle.getLengthOfCycle(list.getHead()));
    }
}
