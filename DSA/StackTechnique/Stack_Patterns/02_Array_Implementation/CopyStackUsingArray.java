public class CopyStackUsingArray {
    static class Stack {
        int[] arr;
        int top;
        int size;

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
                return;
            }
            arr[++top] = val;
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }
            return arr[top--];
        }

        static Stack copyStack(Stack s1) {
            Stack temp = new Stack(s1.size);
            Stack s2 = new Stack(s1.size);

            while (!s1.isEmpty()) {
                temp.push(s1.pop());
            }

            while (!temp.isEmpty()) {
                int x = temp.pop();
                s1.push(x);
                s2.push(x);
            }

            return s2;
        }

    }
    public static void main(String[] args) {
        Stack original = new Stack(5);
        original.push(10);
        original.push(20);
        original.push(30);

        Stack copy = Stack.copyStack(original);

        System.out.println("Original stack:");
        while (!original.isEmpty()) {
            System.out.println(original.pop());
        }

        System.out.println("Copied stack:");
        while (!copy.isEmpty()) {
            System.out.println(copy.pop());
        }
    }



}
