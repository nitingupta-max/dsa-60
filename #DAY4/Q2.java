// Java Program to find the frequency of each element in the array

import java.util.Scanner;

public class Q2 {
    static void input(int arr[], int n)
    {
        System.out.println("Enter elements : ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    static void frequency(int arr[])
    {
        int n = arr.length;
        int visited = -1;
        int freq[] = new int[n];
        int count;

        for(int i=0; i<n; i++)
        {
            count = 1;
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    freq[j] = visited;
                }
            }
            if(freq[i] != visited)
            {
                freq[i] = count;
            }
        }

        System.out.println("_______________________________________");
        System.out.println("Elements\t|\tFrequency");
        System.out.println("_______________________________________");
        for(int k=0; k<n; k++)
        {
            if(freq[k]!=visited)
            {
                System.out.println(arr[k]+"\t\t|\t\t"+freq[k]);
            }
        }
        System.out.println("_______________________________________");
    }
    public static void main(String[]args){

    Scanner sc = new Scanner(System.in);

    int n;
    System.out.print("Enter size of array : ");
    n = sc.nextInt();
    int arr[] = new int[n];
    input(arr, n);
    frequency(arr);

    }

    
}
