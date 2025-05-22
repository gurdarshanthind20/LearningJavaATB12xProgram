package ex_06_Ternary_Operator;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {
        // Step 1: Input, output
        int num =-2;
        //output : String -> even or odd

        // Step 2 : if num%2==0, then even else odd
        String result = num%2 ==0 ? "even": " odd";
        System.out.println(result);
    }

}
