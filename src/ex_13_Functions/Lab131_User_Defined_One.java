package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {
       int r1 =sum_of_two_numbers(4,5);
       int r2 =sum_of_two_numbers(12,45);
       int r3 = sum_of_two_numbers(14,5);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
    static int sum_of_two_numbers(int first, int second){
        return first+second;
    }
}
