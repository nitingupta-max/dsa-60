public class Bubble_Sort {

    static void Sort(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<(n-i-1); j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[]args) {
        int arr[] = {1,2,356,77,33,22,11,4,90,6,75};
        Sort(arr);
        System.out.println("Sorted Array : ");
        printArray(arr);
    }
}