
public class StackUsingArray {

    static class Stack {

        int[] arr;   // fixed size array
        int top;     // index of top element
        int size;    // capacity

        Stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }

        boolean isEmpty() {
            return top == -1;
        }

        boolean isFull() {
            return top == size - 1;
        }

        void push(int val) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = val;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60); // overflow

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
