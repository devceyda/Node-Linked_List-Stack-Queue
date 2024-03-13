package Q1;

//-----------------------------------------------------
// Title: Linked List class
// Author: Ceyda/Kuşçuoğlu
// Description: This class implements the linked list
//-----------------------------------------------------

public class LinkedList<T> {
    private Node<T> head;  //this node represents head of the linked list
    private int size;  //this integer hold the size of the linked list

    public LinkedList()//--------------------------------------------------------
 // Summary: this constructor creates an empty linked list
 // Precondition: 
 // Postcondition: creates empty linked list
 //--------------------------------------------------------
 {
        this.head = null;
        this.size = 0;
    }

    public Node<T> getHead()//--------------------------------------------------------
 // Summary: returns the head of the linked list.
 // Precondition: returns Node<T>
 // Postcondition: returns the head of the linked list.
 //--------------------------------------------------------
 {
        return head;
    }

    public void add(T data) //--------------------------------------------------------
 // Summary: adds node to the linked list.
 // Precondition: takes parameter data type T
 // Postcondition: inserts node to the linked list
 //--------------------------------------------------------
 {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(T data)//--------------------------------------------------------
 // Summary:removes the node which includes the taken data.
 // Precondition: takes paramater data type T
 // Postcondition: deletes the node which inculudes the given data.
 //--------------------------------------------------------
 {
        if (head == null) {
            return;
        }
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return;
        }
        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
    }

    public int size()//--------------------------------------------------------
 // Summary: returns the size of the linked list
 // Precondition: returns integer
 // Postcondition: returns the capacity of the linked list
 //--------------------------------------------------------
 {
        return size;
    }

    public boolean isEmpty()//--------------------------------------------------------
 // Summary: checks if linked list empty or not
 // Precondition: returns type boolean
 // Postcondition: controls the whether the list is empty or not
 //--------------------------------------------------------
 {
        return size == 0;
    }

    public int indexOf(Object obj) //--------------------------------------------------------
 // Summary:it returns the index of node which includes the taken object.
 // Precondition: returns integer and takes object parameter.
 // Postcondition: retrives the index of node which includes the given object
 //--------------------------------------------------------
 {
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if (current.data.equals(obj)) {
                return i;
            }
            current = current.next;
        }
        return -100;
    }

}

    

