// Kelas utama untuk memulai program
public class Main {
    public static void main(String[] args) {
        int[] elements = {20, 17, 12, 14, 27, 9, 23, 20, 21, 27}; // Inisialisasi deret angka
        
        // Binary Search Tree
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println("Insert Data Step by Step (Binary Search Tree)");
        System.out.println("=============================================");
        for (int element : elements) {
            bst.insert(element);
            System.out.println("Insert: " + element);
        }
        System.out.println();

        System.out.println("Diagram Struktur BST");
        System.out.println("====================");
        bst.printTree();
    }
}
