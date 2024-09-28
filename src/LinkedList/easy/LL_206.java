package LinkedList.easy;

import LinkedList.easy.ListNode;

public class LL_206 {

    public ListNode reverseList(ListNode head) {
        if(head == null) return null;

        ListNode curr = head;
        ListNode next = curr.next;
        head = null;

        while(next != null){
            curr.next = head;
            head = curr;
            curr = next;
            next = next.next;
        }
        curr.next = head;
        head = curr;

        return head;

    }
}
