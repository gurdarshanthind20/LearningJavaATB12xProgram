package ex_04_Operators;

public class Lab50_New_operator {
    public static void main(String[] args) {
        // New Operator
        String s1 = new String ("Gurdarshan");
        //Learn in OOPS
        // 1.Java stores string literals in a special place called the String Pool.
        // 2.If another string with the same value is created
        // like string s1 = "hello" and
        //string s2 ="hello"
        //Java reuses the same object from the pool. So s1 and s2
        // point to the same object in memory.
        // new operator creates a new object in memory,
        // even if the same string already exists in the pool.
        //Even though the content is the same ("hello"),
        //    they are not the same object because new String() creates a new one.
    }
}
