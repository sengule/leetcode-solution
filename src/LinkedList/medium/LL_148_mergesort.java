package LinkedList.medium;

import java.util.ArrayList;
import java.util.Collections;

public class LL_148_mergesort {

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ArrayList<Integer> list = new ArrayList();

        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(list);

        ListNode newHead = new ListNode(list.get(0));
        ListNode temp = newHead;

        for(int i = 1; i < list.size(); i++){
            ListNode newNode = new ListNode(list.get(i));
            temp.next = newNode;
            temp = temp.next;
        }

        return newHead;
    }

    public ListNode mergeSortSolution(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null;

        ListNode n1 = sortList(head);
        ListNode n2 = sortList(slow);

        return mergeSort(n1, n2);
    }

    public ListNode mergeSort(ListNode n1, ListNode n2){
        ListNode p = new ListNode(0);
        ListNode l = p;

        while(n1 != null && n2 != null){

            if(n1.val < n2.val){
                p.next = n1;
                n1 = n1.next;
            }else{
                p.next = n2;
                n2 = n2.next;
            }
            p = p.next;
        }

        if(n1 != null){
            p.next = n1;
        }

        if(n2 != null){
            p.next = n2;
        }

        return l.next;
    }
}
