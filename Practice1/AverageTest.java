package Practice1;
import java.util.*;

public class AverageTest {
    public static void Average(int a, int b, int c) {
        int avg1 = (a + b + c) / 3;
        System.out.println("The Average  A : B : C is : "+avg1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Average(a, b, c);
    }
}
