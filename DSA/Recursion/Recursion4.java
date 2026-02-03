
public class Recursion4 {
    public static int printFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int facto1 = printFactorial(n-1);
        int cal = n * facto1;
        return cal;
        
    }

    public static void main(String args[]) {
        int n = 5;
        int ans1 = printFactorial(n);
        System.out.println(ans1);

    }
}
