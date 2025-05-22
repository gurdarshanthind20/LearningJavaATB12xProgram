package ex_07_Increment_Decrement_Op;

public class Lab071_POST_ID {
    public static void main(String[] args) {
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);
        //a_post++ is post-increment.
        // It means: Use the current value first. Then increase it by 1

        //1. int a_post = 10;
        //→ a_post is now 10
        //System.out.println(a_post++);
        //Prints the current value: 10
        //2. Then increases a_post to 11
        //System.out.println(a_post);
        //Now it prints the updated value, which is 11
    }

}
