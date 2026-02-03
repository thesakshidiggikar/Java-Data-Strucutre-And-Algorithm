public class CountEvenOddNodes {
    static class ListNode {
        int val;
        ListNode next;
    }

    public static void main(String[] args) {
        // create nodes
        ListNode n1 = new ListNode();
        n1.val = 2;

        ListNode n2 = new ListNode();
        n2.val = 5;

        ListNode n3 = new ListNode();
        n3.val = 8;

        // link nodes
        n1.next = n2;
        n2.next = n3;

        // head
        ListNode head = n1;
        System.out.println(countEvenOdd(head)+"The Even Count");

    }

    public static int countEvenOdd(ListNode head) {
        ListNode curr = head;
        int evenc = 0;
        int oddc = 0;
        while (curr != null) {
            if (curr.val % 2 == 0) {
                evenc += 1;
                curr = curr.next;
            } else {
                oddc += 1;
                curr = curr.next;
            }
        }
        return evenc;

    }
}