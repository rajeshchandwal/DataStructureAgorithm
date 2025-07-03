package com.teks.academy.LinkedList;

public class ListNode {
	int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

 class ReverseList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode nextTemp = curr.next; // save next
            curr.next = prev;              // reverse
            prev = curr;                   // move prev
            curr = nextTemp;               // move current
        }

        return prev;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        ListNode reversed = reverseList(head);
        System.out.println("Reversed List:");
        printList(reversed);
    }
}
