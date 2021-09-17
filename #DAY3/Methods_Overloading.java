public class Methods_Overloading {

    /* two or more methods can have same name but different paratmeters such methods are called methods overloading */
    static void add(int a, int b) // a, b are parameters
    {
        System.out.println("Sum = "+(a+b));
    }
    static void add(int a, int b, int c) 
    {
        System.out.println("Sum = "+(a+b+c));
    }
    static void add(int a, int b, int c, int d) 
    {
        System.out.println("Sum = "+(a+b+c+d));
    }

    public static void main(String[]args) {

        add(1,2);
        add(1,2,3);
        add(1,2,3,4);

    }
    
}
