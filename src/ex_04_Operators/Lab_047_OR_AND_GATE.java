package ex_04_Operators;

public class Lab_047_OR_AND_GATE {
    public static void main(String[] args) {
        // || - OR
        System.out.println(true||true); //true
        System.out.println(true||false); //false
        System.out.println(false||true);//true
        System.out.println(false||false);//false

        //  And  && // only true && true returns true
        // T || T -> T ->
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False

    }
}
