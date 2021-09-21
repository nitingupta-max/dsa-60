// Linked List Implementation
import java.util.*;
public class MyLinkedList {
    Node Head;

    // boolean isEmpty()
    // {
    //     if(Head == null)
    //     {
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    //     // or simply write
    //     // return Head == null;
    // }    
    void add(int data)
    {
        Node toadd = new Node(data);

        if(Head == null)
        {
            Head = toadd;
            return;
        }
        Node temp = Head;
        while(temp.next != null)
        {
            temp = temp.next;
        } // temp reaches last node
        temp.next = toadd;
    }
    void print() {
        Node temp = Head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static class Node {
        int data;
        Node next; 

        // Constructor
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static void main(String[]args) {
        MyLinkedList myll = new MyLinkedList();
        // myll.add(1);
        // myll.add(2);
        for(int i=0; i<20; i++)
        {
            myll.add(i);
        }
        System.out.print("Linked List : ");
        myll.print();
    }
}
