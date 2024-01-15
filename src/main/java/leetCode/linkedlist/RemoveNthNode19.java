package main.java.leetCode.linkedlist;

public class RemoveNthNode19 {

    public static void main(String[] args) {
        RemoveNthNode19 removeNthNode19 = new RemoveNthNode19();

        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);

        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        removeNthNode19.removeNthFromEnd(one, 1);
    }

    ListNode removeNthFromEnd(ListNode head, int n) {
        return null;
    }
}
