import java.util.*;

public class Linked_list1 {

    public static void main(String[]args) {

        List<Integer> LL = new LinkedList<>();
    
        LL.add(23);
        LL.add(3);
        LL.add(2);
        LL.add(43);
        LL.add(73);
        LL.add(2,456); // it adds 456 at index 2
        // elements are added in this way 23 ,3 ,2 ,43 ,73
        System.out.println(LL);  // it prints the linked list
        // its prints 43
        System.out.println(LL.get(3));
        LL.remove(2); // it removes 2 from Linked list
        System.out.println(LL);


    }

}