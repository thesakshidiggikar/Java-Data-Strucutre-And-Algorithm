public class FindMax {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7 };
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.println("Max Value : "+maxVal);
    }
}