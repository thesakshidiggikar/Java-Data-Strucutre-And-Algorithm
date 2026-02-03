public class Compare {
    public static void main(String args[]) {
        int i = 12;
        System.out.println("While");
        while (i < 11) {
            System.out.println(i);
            i = i + 1; 
        }

        System.out.println("Do While");
        do { 
            System.out.println(i);
            i++;
        } while (i<12);
    }
    
}
