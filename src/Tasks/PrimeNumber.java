package Tasks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Integer ");
        if (!scanner.hasNextInt()){
            System.out.println("Enter only Integer Value");
            return;
        }
        int num= scanner.nextInt();
        if (num<=0){
            System.out.println("Not Defined");
            return;
        }
        for (int i=2;i<num;i++){
            if (num%i==0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
