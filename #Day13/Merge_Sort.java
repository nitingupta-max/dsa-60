import java.util.Scanner;

public class Merge_Sort {
    static void printArray(int Arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

    static void merge(int A[], int mid, int low, int high) {
        int i, j, k;
        int B[] = new int[high + 1];
        i = low;
        j = mid + 1;
        k = low;

        while (i <= mid && j <= high) {
            if (A[i] < A[j]) {
                B[k] = A[i];
                i++;
                k++;
            } else {
                B[k] = A[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            B[k] = A[i];
            k++;
            i++;
        }
        while (j <= high) {
            B[k] = A[j];
            k++;
            j++;
        }
        for (int p = low; p <= high; p++) {
            A[p] = B[p];
        }
    }

    public static void MS(int A[], int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            MS(A, low, mid);
            MS(A, mid + 1, high);
            merge(A, mid, low, high);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter No. of Elements : ");
        n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter Elements : ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Given Array is : ");
        printArray(A, n);

        MS(A, 0, n - 1);
        System.out.println("Sorted Array is : ");

        printArray(A, n);
        sc.close();
    }

}
