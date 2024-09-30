package LinkedList.medium;

import java.util.Stack;

public class LL_445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nL1 = reverseList(l1);
        ListNode nL2 = reverseList(l2);

        int carry = 0;
        ListNode head = null;

        while(nL1 != null || nL2 != null || carry != 0){
            int val1;
            int val2;

            if(nL1 == null){
                val1 = 0;
            }else{
                val1 = nL1.val;
            }

            if(nL2 == null){
                val2 = 0;
            }else{
                val2 = nL2.val;
            }

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;


            ListNode node = new ListNode(sum);
            node.next = head;
            head = node;

            if(nL1 != null) nL1 = nL1.next;
            if(nL2 != null) nL2 = nL2.next;
        }
        return head;
    }

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

    public ListNode addTwoNumbersFollowUp(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();

        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }

        int val1, val2 , carry = 0;
        ListNode head = null;
        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            if(s1.isEmpty()){
                val1 = 0;
            }else{
                val1 = s1.pop();
            }

            if(s2.isEmpty()){
                val2 = 0;
            }else{
                val2 = s2.pop();
            }

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode temp = new ListNode(sum);
            temp.next = head;
            head = temp;
        }
        return head;
    }

    public ListNode addTwoNumbersFollowUp2(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();

        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }

        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        ListNode head = new ListNode(0);

        while(!s1.isEmpty() || !s2.isEmpty()){
            if(!s1.isEmpty()) sum += s1.pop();
            if(!s2.isEmpty()) sum += s2.pop();
            head.val = sum % 10;
            ListNode node = new ListNode(sum / 10);
            node.next = head;
            head = node;
            sum = sum / 10;
        }
        return head.val == 0? head.next : head;
    }
}
