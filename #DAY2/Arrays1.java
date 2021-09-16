import java.util.Scanner;
public class Arrays1 {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);

        // int []marks = new int[3];   //initialized and memory allocation
        // we also initialze an array as
        // int marks[]= new int[3];
        
        int marks[] = {92, 95, 97};
        // set data
        // int marks[];
        // marks = new int[3] ;
        // data also assign as
        // marks[0] = 92;
        // marks[1] = 95;
        // marks[2] = 97;

        // printing the array
        System.out.println("First element of array is : "+marks[0]);
        System.out.println("Second element of array is : "+marks[1]);
        System.out.println("Third element of array is : "+marks[2]);
        System.out.println("Length of Array is : "+marks.length); // prints the length of array
    }
}