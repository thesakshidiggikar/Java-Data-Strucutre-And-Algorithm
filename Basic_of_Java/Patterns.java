public class Patterns {
    public static void main(String[] args) {
        System.out.println("Running Patterns");

        // print pattern 4x 5 => *
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
