public class PalindromeLinkedList {
        static class ListNode {

            int val;
            ListNode next;
        }

        public static void main(String[] args) {
            ListNode n1 = new ListNode();
            n1.val = (11);

            ListNode n2 = new ListNode();
            n2.val = (2);

            ListNode n3 = new ListNode();
            n3.val = (98);

            ListNode n4 = new ListNode();
            n4.val = (15);

            ListNode n5 = new ListNode();
            n5.val = (21);

            ListNode n6 = new ListNode();
            n6.val = (136);

            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            n4.next = n5;
            n5.next = n6;
            n6.next = null;

            ListNode head = n1;
            // System.out.println(head);
            System.out.println(CheckBoolen(head));
        }

        public static boolean CheckBoolen(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        // STEP 1: middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // STEP 2: reverse second half
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null; // cut

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // STEP 3: compare
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    }

