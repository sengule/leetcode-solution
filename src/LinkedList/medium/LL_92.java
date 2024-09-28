package LinkedList.medium;

public class LL_92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        for(int i = 0; i < left - 1; i++){
            pre = pre.next;
        }

        ListNode mid = pre.next;
        ListNode next = mid.next;

        for(int i = 0; i < right - left; i++){
            mid.next = next.next;
            next.next = pre.next;
            pre.next = next;
            next = mid.next;
        }
        return dummy.next;
    }
}
