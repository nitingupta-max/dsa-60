// Sum using Recursion
public class Sum {
        static int addition(int n)
        {
            if(n==1)
            {
                return 1;
            }
            else
            {
                return n + addition(n-1);
            }
        }
    
        public static void main(String[]args) {
            int n=5;
            System.out.println("Factorial = "+addition(n));
        }

}
