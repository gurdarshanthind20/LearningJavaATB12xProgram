package ex_05_TypeCasting;

public class Lab059_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
//        byte b = val; // Narrowing - Implicit JVM to do it. - Data loss will be there.
        byte b1 = (byte) val; // Narrowing - EXPLICIT JVM to do it. - Data loss will be there.
        System.out.println(b1); // 44
    }
    /*1. You declare an integer variable val and assign it the value 300.
     2. byte b1 = (byte) val;
        You're converting (casting) the int value 300 to a byte.
     3. In java int =32 bits and Byte =8 bits and range is -128 to 127
     4. so, 300 does not fit in this range.
     5.therefore, explicit casting is used, hence only 8 bits is used and binary of 300 is 32 bits. so,
      last 8 bits are used : 00101100 → This is 44 in decimal.
      So, (byte) 300 becomes 44.
     */


}
