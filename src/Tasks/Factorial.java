package Tasks;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number whose Factorial you want");
        if (!scanner.hasNextInt()){
            System.out.println("please enter a valid Integer number");
            return ;
        }
        int  number = scanner.nextInt();
        BigInteger factorial = BigInteger.valueOf(1);
        int i;

        if(number<0){
            System.out.println("Factorial of negative number is never defined..!!");
            return;
        }
       if (number==0 || number==1){
            System.out.println("By definition Factorial of " +number+ " is always 1");
        } else {
            for ( i=1;i<=number;i++){
                factorial = factorial.multiply(BigInteger.valueOf(i));

            }
            System.out.println("Factorial of " +number+ " is " +factorial);
        }




    }
}
