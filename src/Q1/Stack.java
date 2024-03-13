package Q1;

//-----------------------------------------------------
// Title: Stack class
// Author: Ceyda/Kuşçuoğlu
// Description: This class implements the Stack
//-----------------------------------------------------

public class Stack<T> {
    private Node<T> top; //this Node<T> represents the top of the stack
    private int size;    // this integer holds the size of the stack

    public void push(T data)//--------------------------------------------------------
 // Summary: pushes node into the stack.
 // Precondition: data is type T
 // Postcondition: the node is inserted into the stack.
 //--------------------------------------------------------
 {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Object pop() //--------------------------------------------------------
 // Summary: it pops the top node and remove it from stack then it returns it
 // Precondition: return type is object
 // Postcondition: it removes the top of the stack and returns it.
 //--------------------------------------------------------
 {
        if (top == null) {
            System.out.println("Stack is null");
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }

    public Object peek() {
        //--------------------------------------------------------
 // Summary: it returns the top of the stack
 // Precondition: return type is Object
 // Postcondition: it returns the data of the top of the stack
 //--------------------------------------------------------
        if (top == null) {
            System.out.println("Stack is null");
        }
        return top.data;
    }

    public boolean isEmpty() //--------------------------------------------------------
 // Summary: it controls if stack is null
 // Precondition: it returns boolean type
 // Postcondition: it checks the if stack is empty or not
 //--------------------------------------------------------
 {
        
        return top == null;
    }

    public int getSize()//--------------------------------------------------------
 // Summary: it returns the size of the stack.
 // Precondition: it returns integer
 // Postcondition: it returns the capacity of the stack
 //--------------------------------------------------------
 {
        return size;
    }

    public Object get(int index)//--------------------------------------------------------
 // Summary: it returns the node at the given index
 // Precondition: it returns type object
 // Postcondition: it returns the node in the stack at the given index.
 //--------------------------------------------------------
 {
        Node<T> current = top;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
}

