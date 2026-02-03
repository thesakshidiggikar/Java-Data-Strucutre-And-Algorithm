package Practice1;
import java.util.Scanner;

public class Circumfrence {
    public static void circumfrence(int a) {
        float r = 3.14f;
        float sum = 2 * r * a;
        System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        circumfrence(a);
    }
}
