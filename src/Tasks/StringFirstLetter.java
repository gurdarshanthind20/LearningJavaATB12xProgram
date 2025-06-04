package Tasks;

import java.util.Scanner;

public class StringFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        sentence= sentence.replaceAll("[^A-Za-z ]","");
        sentence= sentence.trim();
        String[] words= sentence.split("\\s+");
        System.out.println("First letter of the string is:-> "+words[0].charAt(0));

    }
}
