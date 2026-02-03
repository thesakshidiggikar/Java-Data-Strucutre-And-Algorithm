public class Deletechar {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tonnyi");

        //Delete character at any index
        sb.deleteCharAt(5);
        System.out.println(sb);
    }
}
