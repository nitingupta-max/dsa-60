// INSERTION and DELETION IN LINKED LIST 
public class Linked_List {
    public class Node {
        int data;
        Node next;

        // constructor
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head;

    // INSERTION AT END
    public void insertAtEnd(int data) {
        Node add = new Node(data);

        if (head == null) {
            head = add;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = add;
    }

    // INSERTION AT STARTING
    public void insertAtStart(int data) {
        Node ADD = new Node(data);
        ADD.data = data;
        ADD.next = head;
        head = ADD;
    }

    // INSERTION AT ANY INDEX
    public void insertAtIndex(int index, int data) {
        Node toadd = new Node(data);
        toadd.data = data;
        toadd.next = null;

        Node temp = head;
        if (index == 0) {
            insertAtStart(data);
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            toadd.next = temp.next;
            temp.next = toadd;
        }
    }
    // deletion at any index

    public void deletionAt(int index) {
        if (index == 0) {
            System.out.println("\nDeleted element is : " + head.data);
            head = head.next;
        } 
        else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node temp1 = null;
            temp1 = temp.next;
            temp.next = temp1.next;
            System.out.println("\nDeleted element is : " + temp1.data);
            temp1 = null;
        }
    }
    // Searching in Linked list
    public int Search(int data)
    {
        Node temp = head;
        int count = 0;
        if(head == null)
        {
            return -1; 
        }
        while(temp.data != data)
        {
            if(temp.next == null)
            {
                return -1;
            }
            else{
                temp = temp.next;
            }
            count++;
        }
        return count;

    }

    // TRAVERSAL OF LINKED LIST
    public void Show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Linked_List LL = new Linked_List();
        
        LL.insertAtEnd(23);
        LL.insertAtEnd(45);
        LL.insertAtEnd(67);
        LL.insertAtStart(20);
        LL.insertAtIndex(0, 90);
        System.out.println("LINKED LIST BEFORE DELETION");
        LL.Show();
        LL.deletionAt(2);
        System.out.println("\nLINKED LIST AFTER DELETION");
        LL.Show();
        int index = LL.Search(67);
        if(index == -1 )
        {
             System.out.println("\nElement Not Found");
        }
        else{
            System.out.println("\nElement found at index : "+index);
        }
         

    }
}