package StringExample;

public class StringConstructors {

    public static void display(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s = new String();            //1
        String s1 = new String("Hello");    //2
        char ch[] = {'K', 'U', 'M', 'A', 'W', 'A', 'T'};
        String s2 = new String(ch);         //3
        String s3 = new String(ch, 1, 5);   //4
        byte b[] = {83, 65, 78, 84, 79, 83, 72};
        String s4 = new String(b);          //5
        String s5 = new String(b, 2, 3);    //6

        display(s);
        display(s1);
        display(s2);
        display(s3);
        display(s4);
        display(s5);
    }
}
