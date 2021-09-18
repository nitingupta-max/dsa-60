// Java Program to sort the elements of an array in ascending order
import java.util.Scanner;

public class Q14 {
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
    static void Display(int arr[])
    {
        for(int i = 0; i<arr.length; i++)
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
        System.out.println("Entered array : ");
        Display(arr);
        sort(arr);
        System.out.println("Sorted array : ");
        Display(arr);
        
    }
    
}
