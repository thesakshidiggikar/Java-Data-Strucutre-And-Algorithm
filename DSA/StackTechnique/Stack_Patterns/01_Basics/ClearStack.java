import java.util.Stack;

public class ClearStack {
    public static void  main(String args[]) {
        Stack<Integer> s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        //stack clear karna 
        while (s.isEmpty()) {
            s.pop();
        }
        if (s.isEmpty()) {
            System.out.println("Yes the Stack is Empty");
        } else {
            System.out.println("The stack is Empty");
        }

    }
}