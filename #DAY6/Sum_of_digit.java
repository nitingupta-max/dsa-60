// sum of digit os a number
public class Sum_of_digit {

    static int Sum_digit(int n)
    {
        return n==0 ? 0 : n%10 + Sum_digit(n/10);
    }
    public static void main(String[]args) {
        int n = 1234;
        System.out.println("sum of digits : "+Sum_digit(n));
    }
    
}
