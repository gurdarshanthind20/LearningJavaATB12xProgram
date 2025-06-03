package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Gurdarshan");
        stringBuffer.append("\tThind");
        System.out.println(stringBuffer);

        String s1 = "Gurdarshan";
        s1 = s1+ "\tSamra";
        System.out.println(s1);
    }
}
