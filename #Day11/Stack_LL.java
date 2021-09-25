public class Stack_LL {

    public class Node{
        int data;
        Node next;
    }

    Node top;
    // constructor
    Stack_LL(){
        this.top = null;
    }

    public boolean isEmpty()
    {
        if(top == null)
        {
            return true;
        }
        return false;
    }

    public void push(int data){
        Node toadd = new Node();
         
        // check if stack (Heap) is full
        if(toadd == null)
        {
            System.out.println("Heap Overflow");
            return;
        }
        toadd.data = data;
        toadd.next = top;
        top = toadd;
    }

    public void pop(){
        Node temp = top;
        if(top == null)
        {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Popped Element : "+temp.data);
        top = top.next;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return top.data;
        }

    }

    public void display()
    {
        if(top == null)
        {
            System.out.println("Stack is Empty");
            return;
        }
        else{
            Node temp = top;
            while(temp != null)
            {
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[]args) {
        Stack_LL stack = new Stack_LL();
        stack.push(34);
        stack.push(54);
        stack.push(84);
        stack.push(94);
        stack.push(14);
        stack.push(44);
        System.out.println("Stack : ");
        stack.display();
        stack.pop();
        System.out.println("Stack : ");
        stack.display();
        int popped = stack.peek();
        System.out.println("Peek : "+popped);
    }
    
}
