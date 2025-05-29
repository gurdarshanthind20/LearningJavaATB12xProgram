package Tasks;

import java.util.Scanner;

public class ReverseLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Integer");
        if (!scanner.hasNextInt()){
            System.out.println("Enter only Integer value");
            return;
        }

        int number= scanner.nextInt();

        int reversed=0;
        for(; number!=0; number= number/10){
            int digit= number%10 ;
            reversed = reversed*10+digit;
        }
        System.out.println("Reversed Number is " + reversed);
    }
}
