import java.util.*;
public class Basic {
    public static void main(String args[]) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 90;
        String[] subject = { "Maths", "Science", "Computer Science", "Hindi", "Sanskrit", "German", "English" };
        for (int i = 0; i <= 8; i++) {
            System.out.println(subject[i]);
        }
        System.out.println("---------------------------------------------");
        System.out.println(marks[0]);
        System.out.println("---------------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("---------------------------------------------");

        
    }
}
