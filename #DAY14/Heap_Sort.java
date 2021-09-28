// heap sort by iterative method
import java.util.Scanner;

public class Heap_Sort {

    static void build_heap(int arr[], int child, int n) {
        int par;
        while (child > 1) {
            par = child / 2;
            if (arr[par] > n) {
                arr[child] = n;
                return;
            }
            arr[child] = arr[par];
            child = par;
        }
        arr[1] = n;
    }

    static int heapify(int arr[], int n) {
        int temp;
        int x = arr[1];
        arr[1] = arr[n];
        n--;
        int i = 1, j = 2 * i;
        while (j <= n) {
            if (j < n) {
                if (arr[j + 1] > arr[j])
                    j = j + 1;
            }
            if (arr[i] < arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i = j;
                j = 2 * j;
            } else
                break;
        }
        return x;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter No. of elements : ");
        n = sc.nextInt();
        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int add = sc.nextInt();
            build_heap(arr, i, add);
        }
        int x;
        for (int j = n; j >= 1; j--) {
            x = heapify(arr, j);
            arr[j] = x;
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }

}