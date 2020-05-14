package StringJoinerExample;

import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the places you have visited recently :");

        //StringJoiner sj = new StringJoiner(" ");          //Constructor : 1
        StringJoiner sj = new StringJoiner(", ", "[(", ")]");  //Constructor : 2
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the place : " + i);
            String place = sc.next();
            sj.add(place);
        }
        System.out.println(sj);
    }
}
