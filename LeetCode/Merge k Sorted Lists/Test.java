public class Test {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[] {
                arrayToList(new int[]{1, 4, 5}),
                arrayToList(new int[]{1, 3, 4}),
                arrayToList(new int[]{2, 6})
        };

        Solution solution = new Solution();
        ListNode merged = solution.mergeKLists(lists);

        printList(merged);
    }

    // int[] → ListNode
    public static ListNode arrayToList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }


    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}



class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        ListNode mergedHead = lists[0];

        for (int i = 1; i < lists.length; i++) {
            mergedHead = mergeTwoLists(mergedHead, lists[i]);
        }

        return mergedHead;
    }

    private ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        if (head1 != null) tail.next = head1;
        if (head2 != null) tail.next = head2;

        return dummy.next;
    }
}
