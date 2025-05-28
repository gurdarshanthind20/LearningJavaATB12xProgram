package ex_11_While;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        // Factorial Program

        // The logic building formula we are discussing.
        // Step number one, you have to figure out what is the data type for input and output.
        // Step number two, write a rough logic around this.
        // Step number three, write a proper logic around this.
        // Step number four, optimize.
        // Step number five, which is edge cases.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program");
        System.out.println("Enter the number");
        if (!scanner.hasNextInt()) {
            System.out.println("You need to enter only Integer value !!");
        }
            int number = scanner.nextInt();
            int factorial =1;
            if (number<=0) {
                System.out.println("Factorial of negative numbers is not defined ");
            }
            if (number> Integer.MAX_VALUE){
                System.out.println(" The number that you have entered in out of bound value");
            }

            int i =1;
            while (i<number ){
                factorial = factorial*i;
                i++;
            }
        System.out.println("Factorial is :-> " + factorial);


    }




}
