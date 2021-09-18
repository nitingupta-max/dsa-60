// Java Program to left rotate the elements of an array
import java.util.Scanner;

public class Q3 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int number[] ={ 1,2,3,4,5};
        int n=3;
        System.out.println("Original Array");
        for(int i=0; i<number.length; i++)
        {
            System.out.print(number[i]+" ");
        }

        // Rotate the given array by n times toward left 

        for(int j=0; j<n; j++)
        {
            // left rotation by one
            int k,first;
            // store first element of array
            first = number[0];
            for(k=0;k<number.length-1; k++)
            {
                // shift array element by one 
                number[k] = number[k+1];
            }

            // placing first element at last

            number[k]=first;
        }

        // displaying array after rotation
        System.out.println("\nArray after rotation : ");
        for(int p=0; p<number.length; p++)
        {
            System.out.print(number[p]+" ");
        }

    }
    
}
