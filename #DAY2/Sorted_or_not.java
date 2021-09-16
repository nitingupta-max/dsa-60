import java.util.Scanner;
public class Sorted_or_not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size : ");
        n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0 ; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;
        
        for(int j=0; j<n-1; j++)
        {
            if(arr[j]>arr[j+1])
            {
                isSorted = false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }


    }
    
}
