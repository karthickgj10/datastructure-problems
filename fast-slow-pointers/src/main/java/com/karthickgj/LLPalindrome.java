package com.karthickgj;

import java.util.List;

public class LLPalindrome {

    public boolean isPalindrome(ListNode head) {

        if(head == null) {
            return false;
        }

        //find the middle of linked list
        MiddleOfLL middleOfLL = new MiddleOfLL();
        ListNode middleNode = middleOfLL.findMiddle(head);

        //reverse the second half
        ReverseLL reverseLL = new ReverseLL();
        ListNode secondHalfHead = reverseLL.reverseLinkedList(middleNode);
        ListNode firstHalfHead = head;
        ListNode tempSecondHalfHead = secondHalfHead;

        //compare the firt and reversed half for palindrome
        while(firstHalfHead != null && secondHalfHead != null) {
            if(firstHalfHead.val != secondHalfHead.val) {
                break;
            }
            firstHalfHead = firstHalfHead.next;
            secondHalfHead = secondHalfHead.next;
        }

        //reverse back to original
        tempSecondHalfHead = reverseLL.reverseLinkedList(tempSecondHalfHead);

        if(firstHalfHead != null || secondHalfHead != null){
            return false;
        }
        return true;
    }



    public static void main(String[] args) {
        LLPalindrome llPalindrome = new LLPalindrome();
        MyLinkedList list = new MyLinkedList();
        ListNode temp = new ListNode(30);
        list.add(new ListNode(10));
        list.add(new ListNode(20));
        list.add(temp);
        list.add(new ListNode(40));
        list.add(new ListNode(50));
        list.add( new ListNode(60));

        llPalindrome.isPalindrome(list.getHead());
    }
}
