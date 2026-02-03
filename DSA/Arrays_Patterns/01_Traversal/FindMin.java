public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7 };
        int minVal1 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal1) {
                minVal1 = arr[i];
            }
        }
        System.out.println("Minimum Value : "+minVal1);
    }
}