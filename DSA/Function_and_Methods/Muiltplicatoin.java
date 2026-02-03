import java.util.*;

public class Muiltplicatoin {
    public static int MultiplyTwoNumber(int a, int b) {
          return a * b;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The Product of 2 Numbers is "+ MultiplyTwoNumber(a, b));
    }
}
