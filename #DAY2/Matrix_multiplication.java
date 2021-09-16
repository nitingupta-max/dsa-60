import java.util.Scanner;
public class Matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter order of square matrix : ");
        n = sc.nextInt();
        int [][]A = new int [n][n];
        int [][]B = new int [n][n];

        // taking elements of matrix A 
        System.out.println("Enter elements of Matrix A : ");
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<n; j++)
            {
                A[i][j] = sc.nextInt();
            }
        }
        // taking elements of matrix B
        System.out.println("Enter elements of Matrix B : ");
        for(int p=0; p<n;p++)
        {
            for(int q=0; q<n; q++)
            {
                B[p][q] = sc.nextInt();
            }
        }
        // multiple both matrix with the help of 3 for loops
        int [][]C = new int [n][n];

        System.out.println("A X B : ");
        for(int x=0; x<n;x++)
        {
            for(int y=0; y<n; y++)
            {
                C[x][y] = 0;
                for(int z=0; z<n; z++)
                {
                    C[x][y] += A[x][z]*B[z][y];
                }
                
            }
        }
        // displaying resultant matrix
        for(int x=0; x<n;x++)
        {
            for(int y=0; y<n; y++)
            {
                System.out.print(C[x][y]+"\t");
            }
            System.out.println();
        }

    }
    
}
