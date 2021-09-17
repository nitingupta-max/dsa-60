public class Factorial {

    void fact(int n) {
        int ans =1; 

        for(int i=1; i <= n; i++)
        {
            ans = ans*i;
        }
        System.out.println("Factorial of "+n+" = "+ans);
    }

    public static void main(String[]args) {

        Factorial fac = new Factorial();
        int i =5;
        fac.fact(i);
        int j =7;
        fac.fact(j);
        int k =6;
        fac.fact(k);
    }
    
}
