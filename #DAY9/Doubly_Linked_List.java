package DOUBLY;

public class Doubly_Linked_List {

    public class Node{
        int data;
        Node next;
        Node prev;
        int key;
        // constructor
        public Node(int key, int data)
        {
            this.key = key;
            this.data = data;
        }
        public void display()
        {
            System.out.print("("+key+","+data+")");
        }    
    }
    Node head;
    Node tail;
    public Doubly_Linked_List()
    {
        head = null;
        tail = null;
    }
    
    boolean isEmpty() {
        return head == null;
    }

    void insertFirst(int key, int data)
    {
        Node toadd = new Node(key, data);
        if(isEmpty())
        {
            tail = toadd;
        }
        else{
            head.prev = toadd;
        }
        toadd.next = head;
        head = toadd;
    }
    void insertLast(int key, int data)
    {
        Node toadd = new Node(key, data);
        if(isEmpty())
        {
            tail = toadd;
        }
        else{
            tail.next = toadd;
            toadd.prev = tail;
        }
        tail = toadd;
    }

    Node deleteFirst()
    {
        Node temp = head;
        if(isEmpty())
        {
            System.out.println("List is Empty");
            return null;
        }
        if(head.next == null)
        {
            tail = null;
        }
        else{
            head.next.prev = null;
        }
        head = head.next;
        return temp;
    }
    Node deleteLast()
    {
        Node temp = tail;
        if(head.next == null)
        {
            head = null;
        }
        else{
            tail.prev.next = null;
        }
        tail = tail.prev;
        return temp;
    }
    void displayForward()
    {
        Node temp = head;
        while(temp != null)
        {
            temp.display();
            temp = temp.next;
            System.out.print(" ");
        }
    }
    void displayBackward()
    {
        Node temp = tail;
        while(temp != null)
        {
            temp.display();
            temp = temp.prev;
            System.out.print(" ");
        }
    }

    Node delete(int key)
    {
        Node temp = head;
        // if list is empty
        if(head == null)
        {
            return null;
        }
        
        while(temp.key != key)
        {
            if(temp.next == null)
            {
                return null;
            }
            else{
                temp = temp.next;
            }
        }
        if(temp == head)
        {
            // change first to point to next Node
            head = temp.next;
        }
        else{
            // by pass the temp Node
            temp.prev.next = temp.next;
        }
        if(temp == tail)
        {
            tail = temp.prev;
        }
        else{
            temp.next.prev = temp.next;
        }
        return temp;
    }
    public static void main(String[]args) {
        Doubly_Linked_List DLL = new Doubly_Linked_List();
        DLL.insertFirst(0, 1); // add 1 at starting
        DLL.insertFirst(1, 67);// add 67 at starting
        DLL.insertFirst(2, 44);// add 44 at starting
        DLL.insertFirst(3, 34);// add 34 at starting
        System.out.println("\nForward View");
        DLL.displayForward();
        System.out.println("\nBackward View");
        DLL.displayBackward();
        DLL.insertLast(4, 100);// add 100 at end
        DLL.insertLast(5, 900);// add 900 at end
        DLL.insertLast(6, 800);// add 800 at end
        DLL.insertLast(7, 700);// add 700 at end

        System.out.println("\nForward View");
        DLL.displayForward();
        System.out.println("\nBackward View");
        DLL.displayBackward();
        DLL.delete(5); // 900 REMOVE
        System.out.println("\nForward View");
        DLL.displayForward();
        DLL.deleteFirst();
        DLL.deleteFirst();

        System.out.println("\nForward View");
        DLL.displayForward();
        DLL.deleteLast();
        DLL.deleteLast();
        System.out.println("\nForward View");
        DLL.displayForward();

    }
    
}
