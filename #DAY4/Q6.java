// Java Program to print the elements of an array in reverse order

import java.util.Scanner;

public class Q6 {
    static void input(int arr[], int n)
    {
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void Display(int arr[])
    {
        System.out.print("Original Array : ");
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    

    static void reverse(int arr[])
    {
        System.out.print("\nReversed Array : ");
        for(int i = arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter no.of elements : ");
        n = sc.nextInt();
        int arr[] = new int [n];

        input(arr, n);
        Display(arr);
        reverse(arr);
    }
    
}
