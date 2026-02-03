import java.util.*;

public class Factorial {

    public static void Facto(int number)
    {

        int f1= 1;
        for (int i = number; i >= 1; i--) {
            f1 = f1 * i;

        }
        System.out.println(f1);
        return;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Facto(number);
    }
}
