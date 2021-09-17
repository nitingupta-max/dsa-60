import java.util.Scanner;

import javax.naming.directory.SearchControls;
public class Linear_search {

    int search(int arr[], int n, int key) 
    {
        for(int i=0; i<n; i++) 
        {
            if(arr[i] == key)
            {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        Linear_search sea = new Linear_search();

        int arr[] = {1,2,34,5,6,67,89,90,88,45,3,12,37};
        int n = arr.length;
        int key;
        System.out.println("Enter key");
        key = sc.nextInt();

        int index = sea.search(arr, n, key);


        System.out.println("Element found at index : "+index);
        
        System.out.println("\n\nNote: -1 represents that element is not found");



    }
    
}
