package Tasks;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String string = scanner.nextLine();
        string= string.toLowerCase();

        int vowel=0;
        int Consonant=0;

            //Loop through each character
        for (int i=0; i<string.length();i++){
            char ch= string.charAt(i);
           // Check if the character is a letter
            if (Character.isLetter(ch)){
                if (ch=='a'|| ch=='e'|| ch=='i'||ch=='o'|| ch=='u'){
                    ++vowel;
                }else {
                    ++Consonant;
                }
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + Consonant);

    }
}
