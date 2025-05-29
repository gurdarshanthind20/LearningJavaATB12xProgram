package Tasks;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.println("welcome to Leap Year Program");
        System.out.println("Enter the year that you want to check");

        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()){
            System.out.println("Please enter a valid year");
            return;
        }
        int year = scanner.nextInt();
        if (year%400==0 ){
            System.out.println(+year+" is a leap year");
        } else if ( year %100==0) {
            System.out.println(+year+" is not a leap year");
        } else if (year%4==0) {
            System.out.println(+year+ " is  a leap year");

        } else {
            System.out.println(+year+" is not a leap year");
        }
    }
}
