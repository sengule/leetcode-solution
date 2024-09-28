package LinkedList.easy;

import LinkedList.easy.ListNode;

public class LL_234 {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp;
        ListNode prev;

        //Find middle of linked list
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;

        while(slow != null){
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        fast = head;
        slow = prev;

        while(slow != null){
            if(slow.val != fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;

    }


    ListNode currHead;
    public boolean recursive(ListNode head) {
        currHead = head;
        return findPolindrome(head);
    }

    public boolean findPolindrome(ListNode last){
        if(last == null) return true;
        boolean previous = findPolindrome(last.next);

        if(last.val == currHead.val){
            currHead = currHead.next;
            return previous;
        }else{
            currHead = currHead.next;
            return false;
        }

    }
}
