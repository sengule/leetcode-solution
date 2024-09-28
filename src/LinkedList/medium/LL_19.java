package LinkedList.medium;

public class LL_19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        if(fast == null) return slow.next;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    int count = 0;
    public ListNode recursive(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        ListNode res = helper(null, head, n);
        return res;
    }

    public ListNode helper(ListNode pre, ListNode curr, int n){
        if(curr == null){
            return null;
        }
        helper(curr, curr.next, n);
        count++;

        if(count == n){
            // remove
            if(pre == null){
                //head
                curr = curr.next;
            }else{
                pre.next = curr.next;
            }
        }
        return curr;
    }
}
