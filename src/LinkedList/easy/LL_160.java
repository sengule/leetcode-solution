package LinkedList.easy;

import LinkedList.easy.ListNode;

public class LL_160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;

        while(a != b){
            a = a != null ? a.next : headB;
            b = b != null ? b.next : headA;
        }

        return a;
    }
}
