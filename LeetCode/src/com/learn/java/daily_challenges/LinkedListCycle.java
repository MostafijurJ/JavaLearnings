package com.learn.java.daily;

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
    next = null;
  }
}

public class LinkedListCycle {
  public static void main(String[] args) {

    System.out.println(detectCycle(null));
  }

  private static ListNode detectCycle(ListNode head) {
    if (head == null || head.next == null) return null;
    ListNode slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        fast = head;
        while (slow != fast) {
          slow = slow.next;
          fast = fast.next;
        }
        return slow;
      }
    }
    return null;
  }


  /**
   * Easy version of detect cycle
   *
   * @param head
   * @return
   */

  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) return false;
    ListNode slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        return true;
      }
    }
    return false;
  }
}
