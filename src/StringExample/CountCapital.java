package StringExample;

import java.util.Scanner;

public class CountCapital {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s1 = sc.nextLine();
        byte b1[] = s1.getBytes();

        int total = 0;
        p:
        for (byte b2 : b1) {
            if (b2 >= 65 && b2 <= 90) {
                total++;
            }
        }
        System.out.println("Total capital letters in string is : " + total);
    }
}
