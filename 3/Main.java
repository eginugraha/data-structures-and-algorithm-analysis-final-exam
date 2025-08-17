// Kelas utama untuk memulai program
public class Main {
    public static void main(String[] args) {
        int[] numbers = {43, 5, 9, 42, 6, 11, 41, 7, 13, 100, 12, 70, 24, 40, 36, 16, 35, 14, 30, 25}; // Inisialisasi deret angka
        
        // Circular Queue Array
        CircularQueueArray arrayQueue = new CircularQueueArray(numbers.length);
        
        // Enqueue deret angka
        for (int num : numbers) {
            arrayQueue.enqueue(num);
        }
        
        // Display circular queue array
        System.out.println("Circular Queue (Array)");
        System.out.println("======================");
        arrayQueue.display();
        System.out.println("Queue size: " + arrayQueue.size());
        System.out.println("Front element: " + arrayQueue.peek());
        System.out.println();
        

        // Circular Queue Linked List
        CircularQueueLinkedList linkedQueue = new CircularQueueLinkedList();

        // Enqueue deret angka
        for (int num : numbers) {
            linkedQueue.enqueue(num);
        }

        // Display circular queue linked list
        System.out.println("Circular Queue (Linked List)");
        System.out.println("===========================");
        linkedQueue.display();
        System.out.println("Queue size: " + linkedQueue.size());
        System.out.println("Front element: " + linkedQueue.peek());
    }
}
