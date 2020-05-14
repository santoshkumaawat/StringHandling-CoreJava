package StringExample;

//understanding string pool and how it works.
public class StringPool {

    public static void main(String[] args) {
        //object will create outside string pool
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        /*object will create inside string pool 
        with same content and different references.*/
        String s3 = "Santosh";
        String s4 = "Santosh";

        /*content is already stored in heap but not in string pool
        so object will create inside string pool with another references*/
        String s5 = "Hello";

        System.out.println(s1 == s2); //false
        System.out.println(s3 == s4); //true because both pointing same address.
        System.out.println(s1 == s5); //false

        //true because it compares content not address.
        System.out.println(s1.equals(s5));
    }
}
