package main.java.grind75.week5;

public class P3MiddleOfTheLinkedList {

    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
//        ListNode six = new ListNode(6);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
//        five.next = six;

        ListNode listNode = middleNode(one);
        System.out.println(listNode.val);
    }

    public static ListNode middleNode(ListNode head) {
        int length = 1;
        ListNode start = head;

        while (head.next != null) {
            head = head.next;
            length++;
        }

        int middle = (length / 2) + 1;
        head = start;

        for (int i = 1; i < middle; i++) {
            head = head.next;
        }

        return head;
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
