package main.java.grind75.week4;


public class P3ReverseLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode listNode = reverse(node1, null);

        while (listNode != null) {
            System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
    }

    // 1 -> 2 -> 3 -> 4 -> 5
    //
    // 5
    // 4
    // 3
    // 2
    // 1
    private static ListNode reverse(ListNode head, ListNode response) {
        if (head == null) {
            return response;
        }

        ListNode temp = head.next;
        head.next = response;
        response = head;
        head = temp;

        return reverse(head, response);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
