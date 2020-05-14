package StringBufferExample;

public class ComapareStringAndStringBuffer {

    public static void main(String[] args) {
        String s1 = new String("Hello");
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(s1.equals(sb));

        String s2 = sb.toString();
        System.out.println(s1.equals(s2));
    }
}
