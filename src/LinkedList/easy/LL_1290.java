package LinkedList.easy;

import LinkedList.easy.ListNode;

public class LL_1290 {

    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int res = 0;

        while(curr != null){
            res = curr.val + (res << 1);
            curr = curr.next;
        }

        return res;
    }

    public int getDecimalValue2(ListNode head) {
        ListNode curr = head;
        StringBuilder sb = new StringBuilder();

        while(curr != null){
            sb.append(curr.val);
            curr = curr.next;
        }
        String binaryNum = sb.toString();
        return Integer.parseInt(binaryNum, 2);
    }
}
