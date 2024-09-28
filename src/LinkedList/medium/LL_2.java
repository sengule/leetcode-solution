package LinkedList.medium;


public class LL_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int firstNum = (l1 == null) ? 0 : l1.val;
            int secondNum = (l2 == null) ? 0 : l2.val;

            int sum = firstNum + secondNum + carry;
            carry = sum / 10;
            sum = sum % 10;


            ListNode node = new ListNode(sum);
            tail.next = node;
            tail = node;

            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }
        return head.next;
    }
}
