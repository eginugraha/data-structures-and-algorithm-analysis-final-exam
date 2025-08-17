// Class Node
public class Node {
    int data;      // Data dalam node
    Node left;     // Referensi untuk left child
    Node right;    // Reference untuk right child
    
    // Constructor untuk membuat node baru
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
