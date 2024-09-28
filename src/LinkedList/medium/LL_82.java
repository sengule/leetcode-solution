package LinkedList.medium;

public class LL_82 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode fast = head, slow = dummyNode;

        while(fast != null){
            int currValue = fast.val;
            if(fast.next != null && fast.next.val == currValue) {
                while(fast.next != null && fast.val == currValue){
                    fast = fast.next;
                }

                if(fast.next == null && fast.val == currValue){
                    slow.next = null;
                    break;
                }else{
                    slow.next = fast;
                }

            }else{
                slow = fast;
                fast = fast.next;
            }
        }
        return dummyNode.next;
    }
}
