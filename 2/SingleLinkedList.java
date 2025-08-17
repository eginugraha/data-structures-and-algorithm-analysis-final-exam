// Class SingleLinkedList untuk insert, insertAfter, delete dan display data
public class SingleLinkedList {
    private Node head;  // Reference
    
    // Constructor
    public SingleLinkedList() {
        this.head = null;
    }
    
    // Insert new node
    public void insert(int data) {
        Node newNode = new Node(data);
        
        // Jika list kosong, tambahkan di head
        if (head == null) {
            head = newNode;
            return;
        }

        // Melakukan traversal hingga tail
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    /**
     * Tampilkan semua data node
     */
    public void display() {
        if (head == null) {
            System.out.println("Maaf, deret angka kosong!");
            return;
        }
        
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
    }

    // Tambahkan node baru setelah data tertentu
    public boolean insertAfter(int afterValue, int newData) {
        Node current = head;
        
        // Melakukan traversal hingga menemukan data yang dicari
        while (current != null && current.data != afterValue) {
            current = current.next;
        }
        
        // Data tidak ditemukan
        if (current == null) {
            System.out.println("Maaf, data tidak ditemukan!");
            return false;
        }
        
        Node newNode = new Node(newData);
        newNode.next = current.next;
        current.next = newNode;
        return true;
    }
    
    // Hapus node berdasarkan spesifik data
    public boolean delete(int data) {
        // Tampilkan jika data kosong
        if (head == null) {
            System.out.println("Maaf, List kosong!");
            return false;
        }
        
        // Jika node head memiliki data yang sesuai
        if (head.data == data) {
            head = head.next;
            return true;
        }
        
        // Lakukan traversal untuk menemukan node yang akan dihapus
        Node current = head;
        Node prev = null;
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        
        // Jika data tidak ditemukan
        if (current == null) {
            System.out.println("Maaf, data tidak ditemukan!");
            return false;
        }
        
        // Hapus node dari list
        prev.next = current.next;
        return true;
    }
}
