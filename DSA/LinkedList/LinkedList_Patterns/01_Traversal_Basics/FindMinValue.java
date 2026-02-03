

    public class FindMinValue {
        static class ListNode {
            int val;
            ListNode next;
        }

        public static void main(String[] args){
            ListNode n1 = new ListNode();
            n1.val=(11);

            ListNode n2 = new ListNode();
            n2.val=(2);

            ListNode n3 = new ListNode();
            n3.val=(98);

            ListNode n4 = new ListNode();
            n4.val=(15);

            ListNode n5 = new ListNode();
            n5.val=(21);

            ListNode n6 = new ListNode();
            n6.val=(136);

            n1.next=n2;
            n2.next=n3;
            n3.next=n4;
            n4.next=n5;
            n5.next=n6;
            n6.next=null;

            ListNode head = n1;
            // System.out.println(head);
            
            System.out.println("This MinValue is  : "+(MinVals(head)));

            
        }

        public static int MinVals(ListNode head) {
            ListNode curr = head;
            int minval = curr.val;
            while (curr != null) {
                if (curr.val < minval) {
                    minval = curr.val;
                    curr = curr.next;
                }
                curr = curr.next;
            }
            return minval;
            
        }
    }