package Tasks;

import java.util.Scanner;

public class StringWordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        sentence=sentence.replaceAll("[^A-Za-z0-9 ]","");
       sentence= sentence.trim();
        String[] word = sentence.split("\\s+");
        System.out.println("Total words are:-> "+word.length);

    }

}
