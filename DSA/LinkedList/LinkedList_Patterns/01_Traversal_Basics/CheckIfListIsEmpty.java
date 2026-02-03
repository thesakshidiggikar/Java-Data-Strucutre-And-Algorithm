
public class CheckIfListIsEmpty {

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
        System.out.println(isEmpty(head));
    }

    public static boolean isEmpty(ListNode head) {
        // logic yahan aayega (abhi nahi)
        if (head == null) {
            return true;
        }
        return false;
        
    }
}
