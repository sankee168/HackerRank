package interviewbit.LinkedLists;

/**
 * Created by sank on 12/10/16.
 */
public class DeleteDuplicatesFromList {
    public static void main(String[] args) {

        PalindromeList.ListNode node = new PalindromeList.ListNode(1);
        PalindromeList.ListNode node1 = new PalindromeList.ListNode(2);
        PalindromeList.ListNode node2 = new PalindromeList.ListNode(2);
//        PalindromeList.ListNode node3 = new PalindromeList.ListNode(2);
//        PalindromeList.ListNode node4 = new PalindromeList.ListNode(2);
//        PalindromeList.ListNode node5 = new PalindromeList.ListNode(3);
//        PalindromeList.ListNode node6 = new PalindromeList.ListNode(3);
//        PalindromeList.ListNode node7 = new PalindromeList.ListNode(4);
        node.next = node1;
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;

        deleteDuplicates(node);

    }

    public static PalindromeList.ListNode deleteDuplicates(PalindromeList.ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        PalindromeList.ListNode temp1 = new PalindromeList.ListNode(0);
        PalindromeList.ListNode temp2 = temp1;

        PalindromeList.ListNode p1 = head;

        while(p1 !=null && p1.next !=null){
            if(p1.val == p1.next.val){
                int dup = p1.val;
                while(p1 !=null && dup == p1.val){
                    p1 = p1.next;
                }
            }else {
                temp2.next = p1;
                p1 = p1.next;
                temp2 = temp2.next;
            }
        }

        if(p1 != null){
            temp2.next = p1;
        }

        return temp1.next;

    }
}
