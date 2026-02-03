public class StringCompare {
    public static void main(String args[]) {
        String fname = "Tony";
        String lname = "Stark";

        // s1>s2  +ve
        // s1==s2 0
        // s1<s2  -ve

        if (fname.compareTo(lname) ==0) {
            System.out.println("The String are same ");
        } else {
            System.out.println("Both strings are not similar");
        }
    }
}
