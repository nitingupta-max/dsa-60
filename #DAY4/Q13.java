// Java Program to right rotate the elements of an array

import java.util.Scanner;

public class Q13 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int number[] ={ 1,2,3,4,5};
        int n=3;
        System.out.println("Original Array");
        for(int i=0; i<number.length; i++)
        {
            System.out.print(number[i]+" ");
        }

        // Rotate the given array by n times toward right

        for(int j=0; j<n; j++)
        {
            // right rotation by one
            int k,last;
            // store last element of array
            last = number[number.length-1];
            for(k=number.length-1;k>0; k--)
            {
                // shift array element by one 
                number[k] = number[k-1];
            }

            // placing last element at first

            number[0]=last;
        }

        // displaying array after right rotation
        System.out.println("\nArray after rotation : ");
        for(int p=0; p<number.length; p++)
        {
            System.out.print(number[p]+" ");
        }

    }
    
}

