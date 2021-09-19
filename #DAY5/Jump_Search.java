// jump sort is combination of both linear search and binary search

public class Jump_Search {

    static int jump_search(int arr[], int key, int n)
    {
        // find block size to be jumped
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;

        // finding element in array if it is present
        while(arr[Math.min(step, n)-1]<key)
        {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if(prev >= n)
            {
                return -1;
            }
        }
        // System.out.println(prev);
        // doing linear search for key in block beginning with prev
        while(arr[prev] < key)
        {
            prev++;
            // If we reached next block or end of array, element is not present
            if(prev == Math.min(step, n)){
                return -1;
            }
        }
        // System.out.println(prev);
        if(arr[prev] == key)
        {
            return prev;
        } 
        return -1;
    }
    public static void main(String[]args) {

        int arr[] = { 1,2,3,4,5,8,9,99,100,1001,1009,9999};

        int key = 8;
        int n = arr.length;

        int index = jump_search(arr, key, n); // returning index of key
        System.out.println("Number "+key+" is present at index : "+index);

    } 
} 