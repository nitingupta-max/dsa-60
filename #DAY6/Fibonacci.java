public class Fibonacci {
    
    static int Fib(int n)
    {
        // if(n==1)
        // {
        //     return 0;
        // }
        // else if(n==2)
        // {
        //     return 1;
        // }
        if(n==1 || n==2)
        {
            return n-1;
        }
        else{
            return Fib(n-1) + Fib(n-2);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("5th element of fibonacci series is : "+Fib(n));
    }
}
