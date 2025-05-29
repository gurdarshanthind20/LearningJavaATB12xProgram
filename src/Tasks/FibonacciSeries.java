package Tasks;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length up to which you want to print the series ");
        if (!scanner.hasNextInt()){
            System.out.println("Enter only Integer Value");
            return;
        }
        // Fibonacci series: 1,1,2,3,5,8,13....
        int num= scanner.nextInt();
        int first=1;
        int second=1;
        System.out.println(first);
        if (num>1){
            System.out.println(second);
        }

        for (int i=3;i<=num;i++){
            int third= first+second;
            System.out.println(third);
            first=second;
            second = third;
        }
    }
}
