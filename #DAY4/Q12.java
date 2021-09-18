// Java Program to print the sum of all the items of the array
import java.util.Scanner;

public class Q12 {
    
    static void input(int arr[], int n)
    {
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void Sum_of_elements_in_array(int arr[])
    {
        double sum =0;
        for(int i=0; i<arr.length; i++)
        {
            sum +=arr[i];
        }

        System.out.println("Sum = "+sum);
    }

    public static void main(String[ ]args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("ENter no. of elements : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        input(arr, n);
        Sum_of_elements_in_array(arr);
    }
    
}
