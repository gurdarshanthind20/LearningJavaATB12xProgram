package Tasks;

import java.util.Scanner;

public class adult_minor_senior_ternary_operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();

        String result =  (age>18)
                ? (age>=65) ? "Senior Citizen": "Adult"
                : (age<18) ? "Minor": "adult";
        System.out.println("you are " + result);
    }
}
