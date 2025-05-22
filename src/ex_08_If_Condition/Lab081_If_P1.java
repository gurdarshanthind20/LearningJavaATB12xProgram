package ex_08_If_Condition;

import java.util.Scanner;

public class Lab081_If_P1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 25){
            System.out.println("Yes you can go to GOA!");
        }else {
            System.out.println("You can't Go to GOA!!");
        }
    }
}
