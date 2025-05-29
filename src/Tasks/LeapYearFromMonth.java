package Tasks;

import java.util.Scanner;

public class LeapYearFromMonth {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input month
        System.out.print("Enter month number (1-12): ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer for month.");
            return;
        }
        int month= scanner.nextInt();
        // Input year
        System.out.print("Enter year: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer for year.");
            return;
        }
        int year = scanner.nextInt();
        if (month<1 || month>12){
            System.out.println("Invalid Month . Enter Between 1 to 12.");
            return;
        }

        int days;
        switch(month){
            case 1, 12, 10, 8, 7, 5, 3:
                System.out.println("31 days");
                break;

            case 4, 11, 6, 9:
                System.out.println("30 days");
                break;

            case 2:
                if(year%400==0){
                    System.out.println("Leap year with 29 days");
                } else if (year%100==0) {
                    System.out.println("Not a leap year. It has 28 days");
                } else if (year%4==0) {
                    System.out.println("Leap Year with 29 days");

                }else{
                    System.out.println("Not a leap year. It has 28 days ");
                }
                break;
            default:
                System.out.println("Invalid month number");


        }


    }
}
