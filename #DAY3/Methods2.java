public class Methods2 {

    static void change(int arr[])
    {
        arr[2] = 90;
    }

    static void change2(int a)
    {
        a = 90;
    }

    public static void main(String[] args) 
    {
        int marks[] = {67,89,45,67,90};
        int x=45;
        change2(x);
        System.out.println("x = "+x); // it prints value 45 not 90 because we pass copy of variable

        change(marks);
        // hera value of marks[2] is change beacuse of  we pass here reference (Address)
        System.out.println("The value of x after running change is : "+marks[2]);

    }


    
}
