package StringExample;

import java.util.Scanner;

public class UserAuthentication {

    public static void main(String[] args) {
        String id = "indore";
        String pass = "india";

        System.out.println("Enter Userid...");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        if (id.equalsIgnoreCase(s1)) {
            System.out.println("Enter Password");
            String s2 = sc.next();
            if (pass.equals(s2)) {
                System.out.println("Welcome...");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid Userid...");
        }
    }
}
