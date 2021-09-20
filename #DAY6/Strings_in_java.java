// Strings are immutable in java
public class Strings_in_java {
    public static void main(String[]args) {
       /* Each time we create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool.*/

        String a = "Nitin"; // string lateral

        String b = "Nitin"; //It doesn't create a new instance  

        System.out.println(a);
        a = "Gupta"; // here we don't change string we creating new object
        System.out.println(a);

        char []ch = {'N','I','T','I','N'};

        for(int i=0; i<ch.length; i++)
        {
            System.out.print(ch[i]);
        } // prints // NITIN
        System.out.println(); // prints NITIN
        //or
        String s1 = new String(ch);
        System.out.println(s1);
        System.out.println();
        String s = new String("Hello World"); // initialised string by keyword
        System.out.println(s);
    }
     
}
