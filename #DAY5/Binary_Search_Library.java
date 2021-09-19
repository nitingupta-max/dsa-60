import java.util.Arrays;

public class Binary_Search_Library {
    public static void main (String[]args) {

        int marks[] = {22,23,45,27,37,35,33,34,39,40,25,21};
        Arrays.sort(marks);
        System.out.println("Sorted Array : ");
        for(int i=0; i<marks.length; i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        // searching in whole array

        System.out.println("Number 27 is present at index : "+Arrays.binarySearch(marks,27));
        System.out.println("Number 22 is present at index : "+Arrays.binarySearch(marks,22));
        System.out.println("Number 35 is present at index : "+Arrays.binarySearch(marks,35));
        
        System.out.println("Number 25 is present at index : "+Arrays.binarySearch(marks,25));

        //Searing in specified range
        System.out.println("Number 25 is present at index : "+Arrays.binarySearch(marks,2,5,25));
        System.out.println("Number 35 is present at index : "+Arrays.binarySearch(marks,1,3,35)); // it prints -5 
        System.out.println("Number 21 is present at index : "+Arrays.binarySearch(marks,0,4,21));

        

    }
}