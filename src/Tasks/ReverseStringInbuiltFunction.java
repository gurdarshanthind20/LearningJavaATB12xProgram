package Tasks;

import java.util.Scanner;

public class ReverseStringInbuiltFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String you want to reverse");
        String string= scanner.nextLine();
        StringBuffer sb = new StringBuffer(string);
        System.out.println("Reversed String is :-> "+sb.reverse() );
    }
}
