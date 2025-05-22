package ex_04_Operators;

public class Lab51_InstanceOf_Operator {
    public static void main(String[] args) {
        //New Operator
        String s1= new String ("Gurdarshan");
        int a=10;
        //Learn in OOps
        /*instanceof is a keyword in Java used to check if an object is a specific
         type (like a class or interface).

        It returns:
        true → if the object (s1)is an instance of the class (string)
        false → if it's not
        */
        System.out.println( s1 instanceof String);
        // Here S1(Gurdarshan)is a String therefore, it will return true;


    }
}
