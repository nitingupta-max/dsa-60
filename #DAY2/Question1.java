import java.util.Scanner;
public class Question1 {
    public static void main(String[]args) {

        // linear Search in array
        Scanner sc = new Scanner(System.in);
        int []date = {1,3,5,23,22,9,8,7,12,30,22,11,19,18,31};
        int search_num;
        int g=0;
        System.out.println("For Which Date you looking for : ");
        search_num = sc.nextInt();
        // one one searching the number
        for(int i=0; i<date.length; i++)
        {
            if(date[i] == search_num)
            {
                g++;
            }

        }
        if(g==0){
            System.out.println("Not Available");
        }
        else{
            System.out.println("Available");
        }
    }
}