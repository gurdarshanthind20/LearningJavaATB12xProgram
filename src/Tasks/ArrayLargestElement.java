package Tasks;

import java.util.Scanner;

public class ArrayLargestElement {
    public static void main(String[] args) {
        //Print the Largest Element in an Array.
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter "+size+ " Integers");
        for (int i=0;i<size;i++){
            array[i]= scanner.nextInt();
        }
        System.out.println("The Array is: ");
        for (int i=0;i<size;i++){
            if (i!=size-1){
                System.out.print(array[i]+", ");
            }else {
                System.out.print(array[i]);
            }
        }
        System.out.println();
        //LOGIC
        int max= array[0];

        for (int i=0;i<size;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Largest element is : "+max);


        scanner.close();

    }
}
