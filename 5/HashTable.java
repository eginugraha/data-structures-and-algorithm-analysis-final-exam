// Kelas HashTable untuk menyimpan dan mengelola key menggunakan metode hashing dan linear probing
public class HashTable {
    private String[] table;
    private int size;
    private int capacity;
    
    // Constructor
    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new String[capacity];
        size = 0;
    }
    
    // Menghitung nilai hash untuk key
    private int hash(String key) {
        int hashVal = 0;
        
        for (int i = 0; i < key.length(); i++) {
            hashVal += key.charAt(i);
        }
        return hashVal % capacity;
    }
    
    // Memasukkan key ke dalam hash table menggunakan linear probing
    public boolean insert(String key) {
        int position = hash(key);
        
        // Mencari slot kosong menggunakan linear probing
        for (int i = 0; i < capacity; i++) {
            int slot = (position + i) % capacity;
            
            // Jika slot kosong, simpan key di sini
            if (table[slot] == null) {
                table[slot] = key;
                size++;
                System.out.printf("Key=%-9s | Hash Value=%-2d | Index=%-2d | Probes=%-2d%n",
                    key, position, slot, i + 1);
                return true;
            }
            
            // Jika key sudah ada, jangan dimasukan kembali
            if (key.equals(table[slot])) {
                return false;
            }
        }
        return false;
    }
    
    /**
     * Mencetak status terkini dari tabel hash dalam format tabel
     */
    public void showTable() {
        System.out.print("Index: ");
        for (int i = 0; i < capacity; i++) {
            System.out.printf(" %-9d", i);
        }
        System.out.println();

        System.out.print("Value: ");
        for (int i = 0; i < capacity; i++) {
            if (table[i] == null) {
                System.out.print(" -        ");
            } else {
                System.out.printf(" %-9s", table[i]);
            }
        }
        System.out.println();
    }
}