// Transpose of a matrix 

import java.util.Scanner;

public class Q25 {
    static void input(int arr[][], int n)
    {
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    static void Transpose(int arr[][], int n)
    {
        int Transpose[][] = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                Transpose[i][j] = arr[j][i];
                System.out.print(Transpose[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter order of Square matrix : ");
        n = sc.nextInt();
        int arr[][] = new int[n][n];
        input(arr, n);
        Transpose(arr, n);

    }
}