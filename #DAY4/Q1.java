// Java Program to copy all elements of one array into another array

import java.util.Scanner;

public class Q1 {

    static void input(int arr[], int n)
    {
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

    }

    static void Copy_and_Display(int arr[])
    {
        int size;
        size = arr.length;
        int arr_new[] = new int[size];

        for(int i=0; i<size; i++)
        {
            arr_new[i] = arr[i];
            System.out.print(arr_new[i]+" ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter no. of Elements : ");
        n = sc.nextInt();

        int arr1[] = new int[n];

        input(arr1,n);
        System.out.println("Copied Array : ");
        Copy_and_Display(arr1);
    }
}