package LinkedList.problems;
import LinkedList.core.*;

class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] list1 = {1,2,4};
        int[] list2 = {1,3,4};
        ListNode head1 = ListNode.createList(list1);
        ListNode.printList(head1);
        ListNode head2 = ListNode.createList(list2);
        ListNode.printList(head2);

        // ListNode current1 = head1;
        // ListNode current2 = head2;
        ListNode result = new ListNode(-1);
        ListNode current = result;
        while (head1 != null && head2 != null) {
            if(head1.val <= head2.val){
                current.next = head1;
                head1 = head1.next;
            }
            else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if(head1 != null){
            current.next = head1;
        }
        if(head2 != null){
            current.next = head2;
        }


        ListNode.printList(result.next);

    }
}
