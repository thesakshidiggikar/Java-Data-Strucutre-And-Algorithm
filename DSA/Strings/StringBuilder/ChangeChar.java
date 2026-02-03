
public class ChangeChar {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        //change chat at index 
        sb.setCharAt(2, 'i');
        System.out.println(sb);
    }
}

