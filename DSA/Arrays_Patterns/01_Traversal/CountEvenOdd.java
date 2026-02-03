
public class CountEvenOdd {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 4, 5, 6, 7 };
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }
        System.out.println("Even Count : " + evenCount);
        System.out.println("Odd Count : " + oddCount);

    }
}