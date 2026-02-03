public class SecondLargets {
    public static void main(String[] args) {
        int[] arr = new int[] { 10, 30, 24, 45, 12, 56 };
        int firstmax = Integer.MIN_VALUE;
        int Secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstmax) {
                firstmax = arr[i];
            }
            if (arr[i] > Secondmax && arr[i] < firstmax) {
                Secondmax = arr[i];
            }

        }
        System.out.println("Second Largest: " +Secondmax);
    }
}
