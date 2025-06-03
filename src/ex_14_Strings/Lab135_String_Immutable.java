package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name =" Gurdarshan Thind"; // it is stored in String Constant pool
        name.toUpperCase(); //It will not be converted into uppercase because Strings in Java are immutable.
        System.out.println(name);

    }
}
