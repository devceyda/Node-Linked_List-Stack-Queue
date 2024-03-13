package Q3;

//-----------------------------------------------------
// Title: Linked List class
// Author: Ceyda/Kuşçuoğlu
// Description: This class implements the linked list
//-----------------------------------------------------
public class LinkedList {

    private Node head; //this represents the head of the linked list
    private int numberOfRows; //integer number of rows
    private int numberOfCols; //integer number of columns

    private class Node {
        int data; // this data held by node
        Node right; //this node represenst the next node in the same column
        Node down;  //this node represents first node of the next line

        Node(int data) //--------------------------------------------------------
 // Summary: this constructor creates a new node with given data
 // Precondition: takes paramater integer data
 // Postcondition: this constructor creates a new node with taken data
 //--------------------------------------------------------
 {
            this.data = data;
            this.right = null;
            this.down = null;
        }
    }

    public LinkedList(int numRows, int numCols) //--------------------------------------------------------
 // Summary: it creates an empty linked list with respect to given column and row number
 // Precondition:it takes number of rows and columns 
 // Postcondition: it creates an empty linked list with given column and row numbers
 //--------------------------------------------------------
 {
        this.head = null;
        this.numberOfRows = numRows;
        this.numberOfCols = numCols;
    }

    public void insert(int data, int rowIndex, int columnIndex)//--------------------------------------------------------
 // Summary: it inserts new node into the linked list
 // Precondition: it takes data , number of rows and columns
 // Postcondition: it adds new node into the linked list
 //--------------------------------------------------------
 {
        if (rowIndex >= numberOfRows || columnIndex >= numberOfCols) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.right != null) {
                curr = curr.right;
            }
            curr.right = newNode;
        }

// link the new node to the previous node in the same row
        if (columnIndex > 0) {
            Node prev = getNode(rowIndex, columnIndex - 1);
            prev.right = newNode;
        }
// link the new node to the previous node in the same column
        if (rowIndex > 0) {
            Node prev = getNode(rowIndex - 1, columnIndex);
            prev.down = newNode;
        }
    }

    public int get(int row, int col)//--------------------------------------------------------
 // Summary: it returns the integer at given column and row number
 // Precondition: takes row and column number
 // Postcondition: it returns the integer at given index
 //--------------------------------------------------------
 {
        if (row >= numberOfRows || col >= numberOfCols) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        Node node = getNode(row, col);
        return node.data;
    }

// this method is helper method to get the node at a given index
    private Node getNode(int rowIndex, int colIndex)
 {
        Node curr = head;
        for (int i = 0; i < rowIndex; i++) {
            curr = curr.down;
        }
        for (int j = 0; j < colIndex; j++) {
            curr = curr.right;
        }
        return curr;
    }

    public boolean isType1Matrix() //--------------------------------------------------------
 // Summary: this method checks if given matrix is type1 or not
 // Precondition: returns boolean type 
 // Postcondition: controls whether given matrix type1 or not
 //--------------------------------------------------------
 {
        Node temp = head;

        while (temp != null && temp.right != null && temp.right.right != null) {

            if (temp.data > 0 && temp.right.data > 0 && temp.right.right.data > 0) {

            if(temp.right.data == temp.data+1 && temp.right.right.data == temp.right.data +1){
               // if (temp.data < temp.right.data && temp.right.data < temp.right.right.data) {

                    return true;
                }
            }
            temp = temp.right;
        }
        return false;
    }

    public boolean isType2Matrix() //--------------------------------------------------------
 // Summary: this method checks if given matrix is type2 or not
 // Precondition: returns boolean type 
 // Postcondition: controls whether given matrix type2 or not
 //--------------------------------------------------------
 {
        Node temp = head;

        while (temp != null && temp.right != null) {

            if (temp.data < 0 && temp.right.data < 0) {
                return true;
            }
            temp = temp.right;
        }
        return false;
    }

    public boolean isType3Matrix()  //--------------------------------------------------------
 // Summary: this method checks if given matrix is type3 or not
 // Precondition: returns boolean type 
 // Postcondition: controls whether given matrix type3 or not
 //--------------------------------------------------------
 {
        return isType1Matrix() && isType2Matrix();
    }

}

