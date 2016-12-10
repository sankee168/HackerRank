package interviewbit.LinkedLists;

/**
 * Created by sank on 12/10/16.
 */
public class PalindromeList {
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public int lPalin(ListNode A) {
        if (A == null || A.next == null) {
            return 1;
        }

        ListNode head = A;
        ListNode prev = new ListNode(head.val);
        while (head.next != null) {

            ListNode second = new ListNode(head.next.val);

            second.next = prev;

            prev = second;

            head = head.next;
        }

        while (A.next != null && prev.next != null) {
            if (A.val != prev.val) {
                return 0;
            }

            A = A.next;
            prev = prev.next;
        }

        return 1;
    }
}
