package Q2;

//-----------------------------------------------------
// Title: Stack class
// Author: Ceyda/Kuşçuoğlu
// Description: This class implements the stack
//-----------------------------------------------------
public class Stack {

    private int size; //it represents the size of the stack
    private Node head; // this node is head of the stack

    public Stack() //--------------------------------------------------------
 // Summary: this constructor creates an empty stack
 // Precondition: 
 // Postcondition: this constructor creates and empty stack
 //--------------------------------------------------------
 {
        size = 0;
        head = null;
    }

    public boolean isEmpty()//--------------------------------------------------------
 // Summary: this checks whether stack is empty or not
 // Precondition: returns type boolean
 // Postcondition: this method controls if stack is empty or not 
 //--------------------------------------------------------
 {
        return (size == 0);
    }

    public void push(Character data)//--------------------------------------------------------
 // Summary: pushes node into the stack
 // Precondition: it takes parameter data type Character
 // Postcondition: addes node into the stack 
 //--------------------------------------------------------
 {
        Node temp = new Node(data);
        temp.setNext(head);
        head = temp;
        size++;
    }

    public Character pop() //--------------------------------------------------------
 // Summary: it removes the head of the stack and returns the data of it
 // Precondition: returns type Character
 // Postcondition: it pops the head of the stack and returns it
 //--------------------------------------------------------
 {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {

            Character result = head.getData();
            head = head.getNext();
            size--;
            return result;
        }
    }

    public Character peek() //--------------------------------------------------------
 // Summary: it returns the head of the stack without removing
 // Precondition: returns type Character
 // Postcondition: it returns the head of the stack without deleting
 //--------------------------------------------------------
 {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return head.getData();
        }

    }
}


