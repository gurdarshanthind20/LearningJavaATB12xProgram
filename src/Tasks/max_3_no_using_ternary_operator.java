package Tasks;

import java.util.Scanner;

public class max_3_no_using_ternary_operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        int max = (a>b)
                ? (a>c ? a: c)
                : (b>c ? b:c);
        System.out.println("max value is " +max);
    }
}
