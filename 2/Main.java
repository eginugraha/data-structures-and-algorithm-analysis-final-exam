// Kelas utama untuk memulai program
public class Main {
    public static void main(String[] args) {
        int[] numbers = {43, 5, 9, 42, 6, 11, 41, 36, 16, 35, 14, 30, 25, 7, 13, 100, 12, 70, 24, 40}; // Inisialisasi deret angka
        SingleLinkedList list = new SingleLinkedList();
        
        // Insert Awal
        System.out.println("Insert Awal Deret Angka:");
        for (int num : numbers) {
            list.insert(num);
        }
        list.display();
        System.out.println();

        // Insert 15 after 12
        System.out.println("Insert 15 after 12:");
        list.insertAfter(12, 15);
        list.display();
        System.out.println();

        // Delete 24
        System.out.println("Delete 24:");
        list.delete(24);
        list.display();
    }
}
