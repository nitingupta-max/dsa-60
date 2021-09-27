import java.util.Scanner;

public class Quick_Sort {

    public static int partition(int A[], int low, int high)
    {
        int pivot = A[low];
        int i = low+1;
        int j = high; 
        int temp;

        do{
            while(A[i]<=pivot)
            {
                i++;
            }
            while(A[j]>pivot)
            {
                j--;
            }
            if(i<j)
            {
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }while(i<j);

        temp = A[low];
        A[low] = A[j];
        A[j] = temp;

        return j; // partiition position
    }

    public static void quickSort(int A[], int low, int high)
    {
        int partitionIndex;
        if(low<high)
        {
            partitionIndex = partition(A,low,high);
            quickSort(A, low, partitionIndex);
            quickSort(A, partitionIndex+1, high);
        }

    }

    public static void printArray(int A[])
    {
        for(int i=0; i<A.length; i++)
        {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of Array : ");
        int n;
        n = sc.nextInt();
        int Arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            Arr[i] = sc.nextInt();
        }
        System.out.println("Before Sorting : ");
        printArray(Arr);
        System.out.println("After Sorting : ");
        quickSort(Arr, 0, n-1);
        printArray(Arr);
        sc.close();

    }
}