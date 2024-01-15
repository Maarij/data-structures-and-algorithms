package main.java.grind75.week1;

public class P3MergedTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1A = new ListNode(1);
        ListNode list1B = new ListNode(2);
        ListNode list1C = new ListNode(4);
        list1A.next = list1B;
        list1B.next = list1C;

        ListNode list2A = new ListNode(1);
        ListNode list2B = new ListNode(3);
        ListNode list2C = new ListNode(4);
        list2A.next = list2B;
        list2B.next = list2C;

        ListNode head = mergeListsRecursive(list1A, list2A);
//        ListNode head = mergeListsIterative(list1A, list2A);\

        while (head.next != null) {
            System.out.print(head.val);
            head = head.next;
        }
        System.out.print(head.val);
    }

    // 1 2 4
    // 1 3 4
    //
    // 1 1 2 3 4 4
    private static ListNode mergeListsRecursive(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeListsRecursive(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeListsRecursive(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null) {
            return list2;
        }
        return list1;
    }

    static ListNode mergeListsIterative(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);
        ListNode current = prehead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = list1 == null ? list2 : list1;

        return prehead.next;
    }

    private static class ListNode {
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
