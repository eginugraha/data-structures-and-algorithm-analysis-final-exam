// Class SearchBinaryTree untuk insert dan diagram tree BST
public class BinarySearchTree {
    Node root; // Root dari binary search tree

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Method untuk menambahkan node baru ke BST
     * Properti BST: left < root < right
     */
    public void insert(int data) {
        root = insertRecursive(root, data);
    }

    // Recursive insertion
    private Node insertRecursive(Node node, int data) {
        // Jika tree kosong
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insertRecursive(node.left, data);
        } else if (data > node.data) {
            node.right = insertRecursive(node.right, data);
        }
        
        return node;
    }

    // Print tree diagram BST
    public void printTree() {
        printTreeRecursive(root, "", true);
    }

    // Recursive tree print
    private void printTreeRecursive(Node node, String prefix, boolean isLeft) {
        if (node == null) return;
        System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.data);
        String childPrefix = prefix + (isLeft ? "│   " : "    ");
        printTreeRecursive(node.left, childPrefix, true);
        printTreeRecursive(node.right, childPrefix, false);
    }
}
