public class Recursion1 {
    public static void printnumb(int n) {
        if (n == 0) {
            return;
        }
        
        System.out.println(n);
        printnumb(n-1); //step
        
    }
    public static void main(String args[]) {
        int n = 5; //starting
        printnumb(n); //5
    }
}
