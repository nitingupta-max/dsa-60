public class Methods {
    // method for adding two numbers

    // static void add(int a, int b) {
    //     int z; 

    //     z = a + b;
    //     System.out.println("The Sum of given Two numbers is : "+z);

    // }

    // public static void main(String[] args) {
    //     int a = 9, b=8;

    //     // calling the method for adding two numbers
    //     add(a,b);
    //     int p=100, q =9080;
    //     add(p,q);
    // }

    // another method to define a method

    // static keyword is not used
    
    void add(int a, int b) {
        int z; 

        z = a + b;
        System.out.println("The Sum of given Two numbers is : "+z);

    }

    public static void main(String[] args) {

        Methods obj = new Methods(); // creating an object
        int a = 9, b=8;

        // calling the method for adding two numbers
        obj.add(a,b);
        int p=100, q =9080;
        obj.add(p,q);
    }
}