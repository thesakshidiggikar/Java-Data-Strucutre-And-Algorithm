public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 30, 40, 50 };
        int target = 20;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("element found at index: " + i);
            }
        }
    }
}
