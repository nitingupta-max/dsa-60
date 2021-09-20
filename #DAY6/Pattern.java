public class Pattern {

    static void pattern1(int n)
    {
        if(n>=1)
        {   
            for(int i=0; i<n; i++){
                System.out.print("* ");
            }
            System.out.println();
            pattern1(n-1);
        } 
    }
    static void pattern2(int n)
    {
        if(n>=1)
        {   
            pattern2(n-1);
            for(int i=0; i<n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n = 5;
        pattern2(n);
        System.out.println("* * * * * *");
        pattern1(n);
        
    }

    
}
