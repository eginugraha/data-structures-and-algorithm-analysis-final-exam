// Kelas CircularQueueLinkedList untuk menambah dan melihat element dalam queue
public class CircularQueueLinkedList {
    private Node front;
    private Node rear;
    private int size;
    
    // Constructor
    public CircularQueueLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    // Get current size of queue
    public int size() {
        return size;
    }

    // Menambah element ke dalam queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }

        rear = newNode;
        rear.next = front;
        
        size++;
    }
    
    // Menampilkan element pertama
    public int peek() {
        if (front == null) {
            System.out.println("Queue kosong!");
            return -1;
        }
        return front.data;
    }
    
    // Menampilkan semua element dalam queue
    public void display() {
        if (front == null) {
            System.out.println("Queue kosong!");
            return;
        }
        
        Node current = front;
        
        do {
            System.out.print(current.data);
            current = current.next;
            if (current != front) {
                System.out.print(", ");
            }
        } while (current != front);
        
        System.out.println();
    }
}
