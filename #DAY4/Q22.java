import java.util.Scanner;

public class Q22 {
    static void input_matrix(int matrix[][], int n) {
        // n->order
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    static void add_matrix(int a[][], int b[][], int n) {
        int c[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j]; // use - for subtraction
                System.out.print(c[i][j] + " ");
            }
            System.out.println();// new line
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter order of square matrix : ");
        n = sc.nextInt();
        int A[][] = new int[n][n];
        int B[][] = new int[n][n];
        System.out.println("Enter elements of matrix 1 : ");
        input_matrix(A, n);
        System.out.println("Enter elements of matrix 2 : ");
        input_matrix(B, n);
        System.out.println("Resultant Matrix : ");
        add_matrix(A, B, n);
    }

}
