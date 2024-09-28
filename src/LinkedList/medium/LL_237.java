package LinkedList.medium;

public class LL_237 {

    public void deleteNode(ListNode node) {
        ListNode curr = node;
        ListNode pre = null;

        while(curr != null){
            ListNode next = curr.next;

            if(next == null){
                pre.next = null;
                break;
            }

            curr.val = next.val;
            pre = curr;
            curr = curr.next;
        }
    }
}
