import java.util.*;

public class AddTwoNumbers {
    public static void AdditionNumber(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of 2 given Numbers is " + sum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        AdditionNumber(a, b);

    }
}
