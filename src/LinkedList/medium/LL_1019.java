package LinkedList.medium;

import java.util.ArrayList;
import java.util.Stack;

public class LL_1019 {
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while(curr != null){
            size++;
            curr = curr.next;
        }

        int[] res = new int[size];
        int i = 0;
        curr = head;
        while(curr != null){
            ListNode temp = curr.next;

            while(temp != null){
                if(temp.val > curr.val){
                    res[i] = temp.val;
                    break;
                }
                temp = temp.next;
            }

            curr = curr.next;
            i++;
        }

        return res;
    }

    public int[] nextLargerNodes2(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> s = new Stack<>();

        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        int[] res = new int[list.size()];

        for(int i = 0; i < list.size(); i++){

            while(!s.isEmpty() && list.get(s.peek()) < list.get(i)){
                int index = s.pop();
                res[index] = list.get(i);
            }
            s.push(i);
        }

        return res;

    }
}
