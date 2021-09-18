// Remove Duplicate Element in an Array

import java.util.Scanner;

public class Q21 {

    static void input(int arr[], int n)
    {
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void sort(int arr[])
    {
        int temp = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
    }
    static int remove_Duplicate(int arr[], int n)
    {
        if(n == 0 || n==1)
        {
            return n;
        }
        int temp[] = new int[n];
        int j=0;
        for(int i=0; i<n-1; i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // changing orginal array
        for(int k=0; k<j; k++)
        {
            arr[k] = temp[k];
        }
        return j;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter no. of elements : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        input(arr, n); // taking input
        int length;
        sort(arr);  // sorting array
        length = remove_Duplicate(arr, n); // assign length of new array

        System.out.println("Array after removing duplicates :");
        for(int i=0 ; i<length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
}
