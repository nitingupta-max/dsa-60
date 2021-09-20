public class Power_Using_Rec {

    static long power(int x, int p)
    {
        if(p!=0)
        {
            return x * power(x,p-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[]args) {
        int x=2, p=3;
        System.out.println("2^3 = "+power(x,p));
    }
    
}
