package Q2;

//-----------------------------------------------------
// Title: Queue class
// Author: Ceyda/Kuşçuoğlu
// Description: This class implements the Queue
//-----------------------------------------------------
public class Queue {

    private int capacity; //this integer holds the capacity of queue
    private Character[] arrOfQueue; //this array holds the data in queue
    private int front; //front of the queue
    private int rear;  //rear of the queue
    private int currentSize; //this integer helps to check queue is full or not

    public Queue(int size) //--------------------------------------------------------
 // Summary: this constructor creates an empty queue
 // Precondition:it takes parameter for arrange the size of queue
 // Postcondition:then creates null queue
 //--------------------------------------------------------
 {
        this.capacity = size;
        this.arrOfQueue = new Character[size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public boolean isQueueFull()//--------------------------------------------------------
 // Summary: checks the whether queue is full or not
 // Precondition: returns type boolean
 // Postcondition:controls if queue reached full capacity or not
 //--------------------------------------------------------
 {
        return (capacity == currentSize);
    }

    public boolean isQueueEmpty()//--------------------------------------------------------
 // Summary: it checks the whether queue is empty or not
 // Precondition: returns type boolean
 // Postcondition: controls if queue is null or not
 //--------------------------------------------------------
 {
        return (currentSize == 0);
    }

    public void enqueue(Character data)//--------------------------------------------------------
 // Summary: it adds data to the tail of the queue
 // Precondition: it takes paramater data type Character
 // Postcondition: it inserts data to the tail of the queue
 //--------------------------------------------------------
 {

        if (isQueueFull()) {
            System.out.println("Queue is full !");
            return;
        }
        if (rear == capacity - 1) {
            rear = -1;
        }

        arrOfQueue[++rear] = data;
        currentSize++;
        // System.out.println("Item added to queue: " + data);
    }

    public Character dequeue() //--------------------------------------------------------
 // Summary: it removes the front of the queue and returns the removed data
 // Precondition: returns type Character
 // Postcondition: it deletes the front of the queue and returns it
 //--------------------------------------------------------
 {

        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        }

        Character temp = arrOfQueue[front++];
        if (front == capacity) {
            front = 0;
        }
        currentSize--;
        return temp;
    }

    public Character peek() //--------------------------------------------------------
 // Summary: it returns the front of the queue
 // Precondition: returns type Character
 // Postcondition: it returns the front of the queue
 //--------------------------------------------------------
 {
        return arrOfQueue[front];
    }
}
