// Kelas CircularQueueArray untuk menambah dan melihat element dalam queue
public class CircularQueueArray {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    // Constructor
    public CircularQueueArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }
    
    // Get current size of queue
    public int size() {
        return size;
    }

    // Menambahkan element ke dalam queue
    public boolean enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue penuh!");
            return false;
        }
        
        if (size == 0) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity;
        }
        
        queue[rear] = data;
        size++;
        return true;
    }
    
    // Menampilkan element pertama
    public int peek() {
        if (size == 0) {
            System.out.println("Queue kosong!");
            return -1;
        }
        return queue[front];
    }

    // Menampilkan semua element dalam queue
    public void display() {
        if (size == 0) {
            System.out.println("Queue kosong!");
            return;
        }

        int count = 0;
        int i = front;
        
        do {
            System.out.print(queue[i]);
            if (count < size - 1) {
                System.out.print(", ");
            }
            i = (i + 1) % capacity;
            count++;
        } while (count < size);
        
        System.out.println();
    }
}
