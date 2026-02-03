
public class stacksBasicLinked {

    static class ListNode {

        int var;
        ListNode next;

        public ListNode(int var) {
            this.var = var;
            this.next = null;
        }
    }

    static class Stack {

        private ListNode head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int var) {
            ListNode newNode = new ListNode(var);
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.var;
            head = head.next;
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.var;
        }
    }

    // ✅ MAIN METHOD YAHAN HONA CHAHIYE
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
