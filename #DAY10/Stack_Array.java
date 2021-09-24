public class Stack_Array {
    
    int stack[] = new int[10];
    int top = 0; 

    public void push(int data)
    {
        if(top > 4)
        {
            System.out.println("\nStack Overflow");
        }
        else{
            stack[top] = data;
            top++;
        } 
    }
    public int pop()
    {
        int popped=-1;
        if(top==0)
        {
            System.out.println("\nStack Underflow");  
        }
        else{
            top--; // because after push an element tp incresed by 1
            popped = stack[top];
            stack[top] = 0;
        }
        return popped;
    }

    int peek(){
        int peek = stack[top-1];
        return peek;
    }

    public int size()
    {
        return top;
    }
    public boolean isEmpty()
    {
        if(top == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public void show()
    {
        for(int n : stack)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }

    public static void main(String[]args) {
        Stack_Array stack = new Stack_Array();
        System.out.println(stack.isEmpty());
        stack.push(23);
        stack.push(53);
        stack.push(63);
        stack.push(83);
        stack.push(93);
        stack.show();
        stack.push(193); // gives an error beacause max size of array is 5
        stack.show();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
        stack.pop();
        
        // System.out.println("Stack : ");
        // stack.show();
        // int popped = stack.pop();
        // System.out.println("\nPopped element is : "+popped);
        // System.out.println("Stack After Pop : ");
        // stack.show();

        // System.out.println("\nNote : here (0) represents null");
        // int peek = stack.peek();
        // System.out.println("Peek : "+peek);

        // int size = stack.size();
        // System.out.println("Size = "+size);
        // popped = stack.pop();
        // System.out.println("\nPopped element is : "+popped);
        // size = stack.size();
        // System.out.println("Size = "+size);
        // System.out.println(stack.isEmpty());
       

    }
    
}
