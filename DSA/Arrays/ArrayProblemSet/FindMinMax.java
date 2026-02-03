// Find the maximum element in an array

public class FindMinMax {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 34, 43, 28, 11 };
        int max = arr[0];
        int mini = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
        
            }

        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        System.out.println("The Maximum element found at index: " + max);
        System.out.println("The Minimum element found at index: " + mini);
    }
}