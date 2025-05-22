package ex_06_Ternary_Operator;
 import java.util.Scanner;
public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)
        int age= sc.nextInt();

        String max= (age>18)
                ? (age>65)? "Senior": "Adult"
                : (age <18)
                ? "Minor": "Adult";
        System.out.println(max);

    }
}
