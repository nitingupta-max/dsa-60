public class Varargs {

    static int sum(int p, int q)
    {
        return p+q;
    }
    static int sum(int p, int q, int r)
    {
        return p+q+r;
    }
    static int sum(int p, int q, int r, int s)
    {
        return p+q;
    }
    static int sum(int p, int q,int r,int s,int t)
    {
        return p+q;
    }

    static int sum(int ...arr)
    {
        int result = 0;
        // here arr present as array
        for(int a : arr)
        {
            result += a; 
        }
        return result;
    }

    public static void main(String[]args) {
        
        System.out.println("The sum of 2 and 3 is : "+sum(2,3));
        System.out.println("The sum of 2 ,3 and 4 is : "+sum(2,3,4));
        System.out.println("The sum of 2,3,5 and 6 is : "+sum(2,3,5,6));
        System.out.println("The sum of 2,3,5,6 and 7 is : "+sum(2,3,5,6,7));

        System.out.println("sum = "+sum(1,2,3,4,5,6,7,8,9,11,12,13,15));
        System.out.println("sum = "+sum()); // prints 0
    }
}