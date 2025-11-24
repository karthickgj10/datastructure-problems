package com.karthickgj;

public class LLStartOfCycle {

    public ListNode findCycleStart(ListNode head) {
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        int length = linkedListCycle.getLengthOfCycle(head);

        ListNode temp1 = head;
        ListNode temp2 = head;
        while(length != 0) {
            temp1 = temp1.next;
            length--;
        }

        while(temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
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
        LLStartOfCycle llStartOfCycle = new LLStartOfCycle();
        System.out.println(llStartOfCycle.findCycleStart(list.getHead()));
    }
}
