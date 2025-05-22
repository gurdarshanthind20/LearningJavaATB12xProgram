package Tasks;

import java.util.Scanner;

public class even_odd_using_ternary_operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        // n1%2==0 -> even else odd
        String result = n1%2 ==0
                ? "Even":"Odd";
        System.out.println(result);
    }
}
