import java.util.Scanner;

public class Binary_Search {

    static int BSearch(int arr[], int low, int high, int key)
    {
        if(high >= low)
        {
            int mid = (low+high)/2;
            if(arr[mid] == key)
            {
                return mid;
            }
            // If element is smaller than mid, then it can only be present in left subarray

            if(arr[mid] > key)
            {
                return BSearch(arr, low, mid-1, key);
            }
            // Else the element can only be present in right subarray
            
            return BSearch(arr, mid+1, high, key);
        }
        return -1;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of elements : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int key;
        System.out.print("Enter No. for Searching : ");
        key = sc.nextInt();
        
        int index = BSearch(arr, 0, n-1, key);

        System.out.println("Number "+key+" Found at index : "+index);
        sc.close();

    }
}