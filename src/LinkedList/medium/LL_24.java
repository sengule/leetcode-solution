package LinkedList.medium;

public class LL_24 {

    public ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        ListNode fast = head.next;
        ListNode slow = head;
        ListNode pre = null;

        if(fast == null){
            return head;
        }else{
            head = fast;
        }

        while(fast != null){
            slow.next = fast.next;
            fast.next = slow;
            if(pre != null) pre.next = fast;

            ListNode temp = slow;
            slow = fast;
            fast = temp;

            if(fast.next == null) return head;
            pre = fast;
            fast = fast.next.next;
            slow = slow.next.next;
        }

        return head;
    }

}
