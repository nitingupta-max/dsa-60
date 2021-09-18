// Java Program to print the largest element in an array
import java.util.Scanner;

public class Q9 {
    static void input(int arr[], int n)
    {
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    static void max_element(int arr[])
    {
        int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is : "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter no.of elements : ");
        n = sc.nextInt();
        int arr[] = new int [n];

        input(arr, n);
        max_element(arr);
    }
}
