// Java Program to print the elements of an array present on odd position
import java.util.Scanner;

public class Q8 {
    static void input(int arr[], int n)
    {
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void Display_odd_position(int arr[])
    {
        System.out.print("Entered Array : ");
        for(int i = 0; i<arr.length; i++)
        {
            if((i+1)%2!=0)
            {
            System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter no.of elements : ");
        n = sc.nextInt();
        int arr[] = new int [n];

        input(arr, n);
        Display_odd_position(arr);
    }
}
