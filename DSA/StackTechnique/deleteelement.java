import java.util.*;

public class deleteelement {
    public static void main(String args[]) {
        Stack s = new Stack<>();
        s.push(10);
        s.push(12);
        s.push(16);
        s.push(20);
        s.push(24);
        System.out.println(s);

        
        System.out.println("Peek" +s.peek());
        System.out.println(s);
        
        System.out.println("Pop" + s.pop());
        System.out.println(s);

        
    }
}
