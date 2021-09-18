// Program to print the duplicate elements of an array
import java.util.Scanner;
public class Q4 {
    static void input(int arr[], int n)
    {
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    static void print_duplicate(int arr[])
    {
        System.out.println("Duplicate elements in given array : ");

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter No. of elements : ");
        n = sc.nextInt();
        int [] arr = new int[n];

        input(arr, n);
        print_duplicate(arr);



    }

    
}
