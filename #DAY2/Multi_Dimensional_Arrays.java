import java.util.Scanner;

public class Multi_Dimensional_Arrays {
    public static void main(String[]args) {

    Scanner sc = new Scanner(System.in);
    
    // multiDimensional arrays are arrays of arrays

    // int [][] matrix; // 2-D Array
    // matrix = new int[2][2];
    // matrix[0][0] = 1;
    // matrix[0][1] = 2;
    // matrix[1][0] = 3;
    // matrix[1][1] = 4;
    
    // // printing matrix
    // System.out.println("Matrix = ");
    // System.out.print(matrix[0][0]+"\t");
    // System.out.println(matrix[0][1]);
    // System.out.print(matrix[1][0]+"\t");
    // System.out.println(matrix[1][1]);
    
    // taking input of elements of matrix of order n x n

    int n;
    System.out.println("Enter order of Matrix");
    n = sc.nextInt();

    int [][] matrix = new int[n][n];
    // taking input of elements of matrix of order n x n    
    System.out.println("Enter elements of matrix : ");
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            matrix[i][j] = sc.nextInt();
        }
    }

    // printing the matrix
    System.out.println("Matrix : ");
    for(int i=0; i<n; i++) 
    {
        for(int j=0; j<n; j++)
        {
            System.out.print(matrix[i][j]+"\t");
        }
        System.out.println();
    }

    // 3-D Array intialize as below and we can take input or display the elements similary as above 


    // int [][][]numbers = new int[2][2][2];
    
    }
}
