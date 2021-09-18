import java.util.Scanner;

public class Q24 {
    static void input(int arr[], int n)
    {
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void DisplayOddElements(int arr[])
    {
        System.out.print("odd elements : ");
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
            System.out.print(arr[i]+" ");
            }
        }
    }
    static void DisplayEvenElements(int arr[])
    {
        System.out.print("Even elements : ");
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
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
        DisplayEvenElements(arr);
        System.out.println();
        DisplayOddElements(arr);
    }
}