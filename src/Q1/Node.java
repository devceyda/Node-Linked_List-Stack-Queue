package Q1;

//-----------------------------------------------------
// Title: Node class
// Author: Ceyda/Kuşçuoğlu
// Description: This class implements the Node  
//-----------------------------------------------------

public class Node<T> {
    

    protected Node<T> next; //this variable represents the next node in linked list
    protected Object data;  // node holds this object as a data

    public Node(Object data)
    //--------------------------------------------------------
    // Summary: Assigns a value into the node.
   // Precondition: data is a Object and 
  // Postcondition: The value of node is set.
  //--------------------------------------------------------
{
        this.data = data;
    }

    public Node<T> getNext() {
        //--------------------------------------------------------
// Summary: returns the next node if exist
// Precondition: return type is Node<T>
// Postcondition: returns the next node
//--------------------------------------------------------
        return next;
    }

    public void setNext(Node<T> next) //--------------------------------------------------------
// Summary: It will set next node
// Precondition: next is a Node<T>
// Postcondition: The value of the next node is set.
//--------------------------------------------------------
{
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    
    
}



