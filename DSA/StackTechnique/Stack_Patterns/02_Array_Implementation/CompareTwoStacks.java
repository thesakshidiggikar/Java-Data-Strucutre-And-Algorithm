
public class CompareTwoStacks {

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
    }

    static boolean areEqual(Stack s1, Stack s2) {

        if (s1.top != s2.top) {
            return false;
        }

        Stack temp1 = new Stack(s1.size);
        Stack temp2 = new Stack(s2.size);

        while (!s1.isEmpty()) {
            int a = s1.pop();
            int b = s2.pop();

            if (a != b) {
                return false;
            }
            temp1.push(a);
            temp2.push(b);
        }

        while (!temp1.isEmpty()) {
            s1.push(temp1.pop());
            s2.push(temp2.pop());
        }

        return true;
    }

    public static void main(String[] args) {

        Stack s1 = new Stack(5);
        Stack s2 = new Stack(5);

        s1.push(10);
        s1.push(20);
        s1.push(30);

        s2.push(10);
        s2.push(20);
        s2.push(30);

        if (areEqual(s1, s2)) {
            System.out.println("Both stacks are SAME ");
        } else {
            System.out.println("Both stacks are DIFFERENT");
        }
    }
}
