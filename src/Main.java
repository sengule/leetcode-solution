import LinkedList.medium.LL_2;
import LinkedList.medium.LL_328;
import LinkedList.medium.ListNode;


public class Main {
    public static void main(String[] args) {
        // Write testcases here
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(7);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        f.next = g;
        g.next = null;

        LL_328 sol = new LL_328();
        sol.oddEvenList(a);
        System.out.println("Hello world");
    }
}