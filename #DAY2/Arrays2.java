import java.util.Scanner;

public class Arrays2 {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        // taking size of array
        int n;
        System.out.print("Enter Size of an Array : ");
        n = sc.nextInt();

        int []Array = new int[n];

        // taking input of elements of Array

        for(int i=0; i<n; i++)
        {
            Array[i] = sc.nextInt();
        }

        // displaying the elements of Array

        System.out.println("Entered Data : ");
        for(int j=0; j<n; j++)
        {
            System.out.print(Array[j]+"  ");
        }
        System.out.println();
        
        // traversal using for each loop
        // for(int element : Array)
        // {
        //     System.out.println(element);
        // }
    }
    
}
