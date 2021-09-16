public class Max_element_in_array {

    public static void main(String[]args) {

        int []num = { 34,67,56,44,32,367,55,89,99};

        int max = num[0]; // let 1st element is maximum

        for(int i=1; i<num.length; i++)
        {
            if(max<num[i])
            {
                max = num[i];
            }
        }

        System.out.println("Maximum Element : "+max);


    }
    
}
