package Q2;

//-----------------------------------------------------
// Title: Node class
// Author: Ceyda/Kuşçuoğlu
// Description: This class implements the node
//-----------------------------------------------------
public class Node {

    private Node next; //this node represents the next node in the linked list
    private Character data; //this variable is data which held by node

    public Node(Character data){
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Character getData() {
        return data;
    }

    public void setData(Character data) {
        this.data = data;
    }

    
    
}

