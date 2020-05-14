package StringTokenizerExample;

import java.util.StringTokenizer;

public class StringTokenizerEx {

    public static void main(String[] args) {
        String s1 = "Mandsaur Neemuch Indore Ratlam";
        StringTokenizer st1 = new StringTokenizer(s1);      //Constructor : 1
        System.out.println(st1.countTokens());              //Method : 1
        while (st1.hasMoreTokens()) {                       //Method : 2
            System.out.println(st1.nextToken());            //Method : 3
        }
        System.out.println(st1.countTokens());

        System.out.println("======================");

        String s2 = "Santosh,Vijay,Akshay Lalit";
        StringTokenizer st2 = new StringTokenizer(s2, ","); //Constructor : 2
        System.out.println(st2.countTokens());
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        System.out.println("======================");

        String s3 = "India,Australia,Japan,China";
        StringTokenizer st3 = new StringTokenizer(s3, ",", true); //Constructor : 3
        System.out.println(st3.countTokens());
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
    }
}
