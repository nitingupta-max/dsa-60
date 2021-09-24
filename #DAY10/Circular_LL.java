package Circular_LL;

public class Circular_LL {
    public class Node {
        int data;
        int key;
        Node next;

        // constructor
        public Node(int key, int data) {
            this.key = key;
            this.data = data;
        }

        public void display() {
            System.out.print("(" + key + "," + data + ")");
        }
    }

    Node head;

    public Circular_LL() {
        head = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public int length() {
        int length = 0;

        // if list is empty

        Node current = head;
        if (head != null) {
            do {
                length++;
                current = current.next;
            } while (current != head);
        }

        return length;
    }

    void insertFirst(int key, int data) {
        Node temp = new Node(key, data); // creating a new node temp
        if (isEmpty()) {
            head = temp;
            head.next = head;
        } else {
            temp.next = head; // point to old node
            head = temp; // point to new first node
        }
    }

    void diplayLL() {
        // start from the begining
        Node temp = head;
        if (head != null) {
            while (temp.next != temp) {
                temp.display(); // print data of node
                temp = temp.next; // points to next node
                System.out.print(" ");
            }
            temp.display();
        }
    }

    Node deleteFirst() {
        Node temp = head; // stroe the reference of head node
        if (head.next == head) {
            head = null;
            return temp;
        }
        head = head.next; // mark next to head node as head
        return temp;
    }

    public static void main(String[] args) {
        Circular_LL CLL = new Circular_LL();
        
        CLL.insertFirst(1, 5);
        CLL.insertFirst(2, 85);
        CLL.insertFirst(3, 59);
        CLL.insertFirst(4, 599);
        CLL.insertFirst(5, 579);
        CLL.insertFirst(6, 9);
        CLL.insertFirst(7, 5);

//         int length = CLL.length();
//         System.out.println(length);

        CLL.diplayLL();
        System.out.println();
        CLL.deleteFirst();
        CLL.diplayLL();
        System.out.println();
        CLL.deleteFirst();
        CLL.diplayLL();
        System.out.println();
        CLL.deleteFirst();
        CLL.diplayLL();
        System.out.println();
        CLL.deleteFirst();

        CLL.diplayLL();
        System.out.println();

    }
}
