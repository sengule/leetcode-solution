package LinkedList.medium;

public class LL_61 {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int size = 0;
        ListNode curr = head;

        while(curr != null){
            size++;
            curr = curr.next;
        }

        int n = k % size;

        if(n == 0) return head;
        ListNode fast = head;
        ListNode slow = head;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;

        return newHead;
    }
}
