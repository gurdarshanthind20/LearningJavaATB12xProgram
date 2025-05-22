package ex_07_Increment_Decrement_Op;

public class Lab070_ID_Op_PRE {
    public static void main(String[] args) {
        int a=10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        // ++a ->  a = a+1 , increment by 1
        //++a is pre-increment.
        // It first increases the value of a by 1, then uses the new value.
        //int a = 10;
        //→ a is now 10
        //int b = ++a;
        //→ a becomes 11 (incremented first)
        //→ b gets the new value of a, which is 11
        //System.out.println(a);
        //→ prints 11
        //System.out.println(b);
        //→ prints 11
    }
}
