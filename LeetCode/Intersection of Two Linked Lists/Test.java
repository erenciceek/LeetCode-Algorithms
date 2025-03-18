public class Test {
    public static void main(String[] args) {
        ListNode common = new ListNode(4);
        common.next = new ListNode(5);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = common;

        ListNode headB = new ListNode(6);
        headB.next = new ListNode(7);
        headB.next.next = common;

        ListNode intersection = Solution.getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Kesişme noktası: " + intersection.val);
        } else {
            System.out.println("Kesişme yok.");
        }

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode tempA = headA;
        ListNode tempB = headB;

        while (tempA != tempB) {
            tempA = (tempA == null) ? headB : tempA.next;
            tempB = (tempB == null) ? headA : tempB.next;
        }

        return tempA;
    }
}