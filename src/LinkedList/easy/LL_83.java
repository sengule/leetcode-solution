package LinkedList.easy;

public class LL_83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        ListNode temp = new ListNode();

        while(curr != null){
            if(curr.next != null && curr.val == curr.next.val){
                //remove
                temp = curr.next.next;
                curr.next = temp;
            }else{
                curr = curr.next;
            }
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = null;
        System.out.println();
    }
}
