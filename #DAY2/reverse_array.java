// reversing the given array

public class reverse_array {
    public static void main(String[] args) {

        int []numbers = {2,45,56,78,4,3,1,78,9,67,54,32,12,34,78};

        for(int i=numbers.length-1; i>=0; i--)
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    } 
}
