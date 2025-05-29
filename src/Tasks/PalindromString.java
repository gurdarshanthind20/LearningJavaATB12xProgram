package Tasks;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String string= scanner.nextLine();
        string=string.toLowerCase();
        int length= string.length();
        int i=0;
        int j= length-1;

        for (;i<j;i++,j--){
                if(string.charAt(i) != string.charAt(j)){
                    System.out.println("Not Palindrome");
                    return;
                }

        }
        System.out.println("Palindrome");
            }
        }



