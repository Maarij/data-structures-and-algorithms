package main.java.service.linkedlist;

public class DeleteNode237 {

    public static void main(String[] args) {
        DeleteNode237 deleteNode237 = new DeleteNode237();

        ListNode first = new ListNode(4);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(9);

        first.next = second;
        second.next = third;
        third.next = fourth;

        deleteNode237.deleteNode(second);

        return;
    }

    void deleteNode(ListNode nodeToDelete) {
        nodeToDelete.val = nodeToDelete.next.val;
        nodeToDelete.next = nodeToDelete.next.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
