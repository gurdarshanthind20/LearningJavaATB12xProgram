package Tasks;

import java.util.Scanner;

public class StringReverseRecursiveMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create Scanner object
        System.out.print("Enter a word to reverse: ");
        String input = scanner.nextLine();
        if (input.isEmpty()){
            System.out.println("This should not be empty");
        }else {
            String Reversed= ReverseFunction(input);
            System.out.println("Reversed String is:-> "+Reversed);
        }


    }


    public static String ReverseFunction(String str){
        if (str.isEmpty()){
           return str;
        }
        return ReverseFunction(str.substring(1)) + str.charAt(0);
    }




}
