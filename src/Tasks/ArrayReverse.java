package Tasks;

import java.util.Scanner;

public class ArrayReverse {
    //Print elements of an array in reverse order.
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter "+size+" integers");
        for (int i=0;i<size;i++){
          array[i]=scanner.nextInt();
        }
        System.out.println("The array is: ");
        for (int i=0;i<size;i++){
            if (i!=size-1 ){
                System.out.print(array[i]+ " , ");
            }else {
                System.out.println(array[i]);
            }

        }
        System.out.println(" ");


        //LOGIC
        int[] reversedArray = new int[size];
        for (int i=0;i<size;i++){
            reversedArray[i]= array[size-1-i];
        }
        System.out.println("Reversed array is ");
        for (int i=0;i<size;i++){
            if (i!=size-1) {
                System.out.print(reversedArray[i] + ", ");
            }else {
                System.out.println(reversedArray[i]);
            }
        }

        scanner.close();
    }
}
