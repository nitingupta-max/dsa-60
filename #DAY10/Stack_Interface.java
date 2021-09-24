import java.util.Stack;

public class Stack_Interface {
    
    public static void main(String[]args) {

        Stack<Integer> st = new Stack<Integer>();

        st.push(100);
        st.push(200);
        st.push(300);
        st.push(400);
        st.push(500);

        int popped = st.pop(); // pop 500
        System.out.println("Popped Element is : "+popped);
        popped = st.pop();
        System.out.println("Popped Element is : "+popped);
        popped = st.pop();
        System.out.println("Popped Element is : "+popped);
        int peeked = st.peek();
        System.out.println(peeked);
    }
}