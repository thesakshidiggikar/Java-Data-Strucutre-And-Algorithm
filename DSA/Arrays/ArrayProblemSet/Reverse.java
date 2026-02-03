public class Reverse {
    public static void main(String args[]) {
        int arr[] = new int[] { 10, 30, 20, 45, 68, 29 };
        int size = arr.length;
        int rev[] = new int[size];

        int j = 0;
        for (int  i = arr.length-1 ; i > 0; i--) {
            rev[j] = arr[i];
            j++;
            
        }
        System.out.println(rev[0]);

    }
}
