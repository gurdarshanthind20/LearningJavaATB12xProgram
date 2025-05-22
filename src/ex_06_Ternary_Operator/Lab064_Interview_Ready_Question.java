package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {
        // Nested Ternary
        //result =condition ? expression1: (condition2 ? expression2: expression3);
        int number =15;
        String result= (number >18)? (number >25 ? "In Goa, you can drink": "you cannot drink") :"you cannot go to GOA";
        System.out.println(result);
    }
}
