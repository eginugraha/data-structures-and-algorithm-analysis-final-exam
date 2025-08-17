// Kelas utama untuk memulai program
public class Main {
    public static void main(String[] args) {
        int capacity = 8;
        HashTable hashTable = new HashTable(capacity);
        
        String[] items = {"Anting", "Baju", "Celana", "Gelas", "Gunting", "Handphone", "Buku", "Garpu"};
        
        System.out.println("Hash Table dengan Linear Probing size: (" + capacity + ")");
        System.out.println("===============================================");

        for (String item : items) {
            hashTable.insert(item);
        }
        System.out.println();

        System.out.println("Table Akhir");
        System.out.println("===============================================");
        hashTable.showTable();
    }
}
