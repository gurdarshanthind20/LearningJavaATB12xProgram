package Tasks;

import java.util.Scanner;

public class StringReverseForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string that you want to reverse");
        String string = scanner.nextLine();
        String ReversedString="";
        for (int i=string.length()-1;i>=0;i--){
             ReversedString = ReversedString+string.charAt(i);

        }
        System.out.println("Reversed String is:-> "+ReversedString);
    }
}
