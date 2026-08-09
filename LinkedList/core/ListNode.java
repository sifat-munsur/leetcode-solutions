package LinkedList.core;

public class ListNode {

    public int val;
    public ListNode next;
    public ListNode(){

    }
    public ListNode(int val){
        this.val = val; 
    }
    public ListNode(int val, ListNode next){
        this.val = val; this.next = next; 
    }

    public static ListNode createList(int[] arr) {
        if (arr.length == 0){
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}
