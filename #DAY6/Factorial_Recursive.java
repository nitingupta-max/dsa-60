public class Factorial_Recursive {

    static int  Factorial(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        else
        {
            return n * Factorial(n-1);
        }
    }

    public static void main(String[]args) {
        int n=10;
        System.out.println("Factorial = "+Factorial(n));
    }
    
}
