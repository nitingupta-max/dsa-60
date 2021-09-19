import java.util.Scanner;

public class Linear_Search_Recursive {

    static int LSearch(int arr[], int ind1 , int ind2, int key)
    {
        if(ind1>ind2)
        {
            return -1;
        }
        if(arr[ind1] == key)
        {
            return ind1;
        }
        if(arr[ind2] == key)
        {
            return ind2;
        }
        return LSearch(arr, ind1+1, ind2-1, key);
        
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
        int index = LSearch(arr,0,n-1,key);
        System.out.print("Number "+key+" is present at index : "+index);
        sc.close();
    }
}
