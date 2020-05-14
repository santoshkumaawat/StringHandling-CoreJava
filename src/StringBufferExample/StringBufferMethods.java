package StringBufferExample;

public class StringBufferMethods {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Santosh");   //Constructor
        System.out.println(sb);

        //Non Static Methods
        sb.append(" Kumawat");                          //1
        System.out.println(sb);

        sb.insert(5, "Hello");                          //2
        System.out.println(sb);

        sb.replace(5, 10, "");                          //3
        System.out.println(sb);

        sb.setLength(7);                                //4
        System.out.println(sb);

        sb.setCharAt(5, '$');                           //5
        System.out.println(sb);

        sb.deleteCharAt(5);                             //6
        System.out.println(sb);

        sb.delete(3, 6);                                //7
        System.out.println(sb);

        sb.reverse();                                   //8
        System.out.println(sb);

        /*when we need of some methods of string class
        we have to convert string buffer to string by calling toString method
         */
        sb.toString();                                  //9
        System.out.println(sb);
    }
}
