package LinkedList.easy;

import LinkedList.easy.ListNode;

public class LL_203 {

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode curr = head;
        ListNode temp = head;
        while(head != null && head.val == val){
            head = head.next;
        }
        curr = head;
        temp = head;
        while(curr != null){

            if(curr.val == val){
                curr = curr.next;
                temp.next = curr;
            }else{
                temp = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}
