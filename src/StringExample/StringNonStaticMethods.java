package StringExample;

import java.util.Locale;

public class StringNonStaticMethods {

    public static void main(String[] args) {
        String s1 = "This is java";
        int n1 = s1.length();                       //1
        System.out.println(n1);

        String s2 = "Hello";
        String s3 = "Hello";
        boolean b1 = (s2 == s3);
        System.out.println(b1);
        boolean b2 = s2.equals(s3);                 //2
        System.out.println(b2);

        String s4 = "Hello India";
        String s5 = "Hello INDIA";
        boolean b3 = s4.equalsIgnoreCase(s5);       //3
        System.out.println(b3);

        String s6 = "Hello India";
        boolean b4 = s6.startsWith("Hel");          //4
        System.out.println(b4);

        String s7 = "Hello Indore";
        boolean b5 = s7.endsWith("ore");            //5
        System.out.println(b5);

        String s8 = "santosh";
        String s9 = "santosh";
        String s10 = "Santosh";
        int n2 = s8.compareTo(s9);                  //6
        System.out.println(n2);
        int n3 = s9.compareTo(s10);
        System.out.println(n3);
        int n4 = s9.compareToIgnoreCase(s10);       //7
        System.out.println(n4);

        String s11 = "Hello welcome to java";
        System.out.println(s11.indexOf('w'));       //8
        System.out.println(s11.indexOf('w', 7));    //9
        System.out.println(s11.indexOf("to"));      //10
        System.out.println(s11.indexOf("to", 2));   //11
        System.out.println(s11.indexOf(5));         //12

        String s12 = "Hello everyone this is java and we are using jdk8";
        System.out.println(s12.charAt(8));

        String s13 = "I am santosh";
        char ch1[] = s13.toCharArray();              //13
        System.out.println(ch1);
        for (char ch2 : ch1) {
            System.out.println(ch2);
        }

        char ch3[] = {'s', 'a', 'n', 't', 'o', 's', 'h'};
        System.out.println(ch3);
        String s14 = new String(ch3);
        System.out.println(s14);

        String s15 = "Hey how are you bro!";
        byte byt1[] = s15.getBytes();               //14
        System.out.println(byt1);
        for (byte byt2 : byt1) {
            System.out.println(byt2);
        }
        
        String s16= "  Mandsaur MADHYA PRADESH iNDia  ";
        System.out.println(s16.toUpperCase());      //15
        System.out.println(s16.toLowerCase());      //16
        System.out.println(s16.trim());             //17
        System.out.println(s16.substring(11));      //18
        System.out.println(s16.substring(11,25));   //19
    }
}
