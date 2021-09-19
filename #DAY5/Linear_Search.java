import java.util.Scanner;

public class Linear_Search {

    static int LSearch(int arr[], int key)
    {
        int size = arr.length;
        for(int i=0; i<size; i++)
        {
            if(arr[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Number of Elements : ");
        n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter Elements : ");

        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int key;
        System.out.print("Enter Key Element : ");
        key = sc.nextInt();
        int index = LSearch(arr,key);
        System.out.print("Number "+key+" is present at index : "+index);
        sc.close();
    }
    
}
