import java.util.*;
public class InputVariable {
    public static void main(String args[]) {
        //Input
        Scanner sc = new Scanner(System.in); //humne input le liya hai
        String name = sc.next(); //ab jo upar naam liya woh sc.next ki maddat se apn usko store karenge name naam k variable me. yeh sirf ek word lega
        String name1 = sc.nextLine(); //ab yeh pura line print kar dega
        //nextInt() input integer k liye
        //nextFloat()  Floating numbers k liye
        

        System.out.println(name);
        System.out.println(name1);


    }
}
