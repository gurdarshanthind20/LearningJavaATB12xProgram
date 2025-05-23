package Tasks;

import java.util.Scanner;

public class Triangle_Classification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1");
        int s1 = sc.nextInt();
        System.out.println("Enter side 2");
        int s2 = sc.nextInt();
        System.out.println("Enter side 3");
        int s3 = sc.nextInt();

        if(s1 == s2 && s2 == s3){
            System.out.println(" This is an Equilateral Triangle");
        }
        if ((s1 == s2 || s2 == s3 || s3 == s1) && !(s2 == s3 && s1 == s3)){
         System.out.println("This is an Isosceles Triangle");
        }
        if(s1!=s2 && s2!=s3 && s1!=s3) {
            System.out.println("This is a Scalene Triangle");
        }



    }
}
