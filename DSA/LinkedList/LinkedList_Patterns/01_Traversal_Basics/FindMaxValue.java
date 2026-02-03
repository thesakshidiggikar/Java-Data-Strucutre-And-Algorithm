public class FindMaxValue {
    static class ListNode {
        int val;
        ListNode next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode();
        n1.val = (10);
        ListNode n2 = new ListNode();
        n2.val = (20);
        ListNode n3 = new ListNode();
        n3.val = (30);
        ListNode n4 = new ListNode();
        n4.val = (40);
        ListNode n5 = new ListNode();
        n5.val = (50);

        //linint
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        ListNode head = n1;
        System.out.println("The MaxValue"+MaxVal(head));

    }

    public static int MaxVal(ListNode head) {
        ListNode curr = head;
        int maxVal = 0;
        while (curr != null) {
            if (curr.val > maxVal) {
                maxVal = curr.val;
                curr = curr.next;
            }
        }
        return maxVal;
    }
}