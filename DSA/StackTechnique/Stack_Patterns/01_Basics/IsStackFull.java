public class IsStackFull {
    static class Stack {
        int arr[];
        int top;
        int size;

        Stack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }

        boolean isFull() {
            return top == size - 1;
        }

        void push(int val) {
            if (isFull()) {
                System.out.println("Stack is full ");
                return;
            }
            arr[++top] = val;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack(3);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);   // overflow

        System.out.println(s.isFull()); // true
    }
}