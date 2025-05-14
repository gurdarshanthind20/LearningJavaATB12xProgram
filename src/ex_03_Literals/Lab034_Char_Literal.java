package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
//        char c = "AAAAABBBCCCDDD"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Gurdarshan Thind");
        System.out.println("Gurdarshan"+new_line+"Thind");
        System.out.println("Gurdarshan\nThind");
        System.out.println("Gurdarshan"+tab_line+"Thind");
        System.out.println("Gurdarshan"+back_space+"Thind");
        System.out.println( " ----- ");

        System.out.println("Gurdarshan is "+carriage_return+"Thind");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';
        System.out.println(c11);

    }
}
