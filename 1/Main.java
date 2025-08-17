/**
 * Class utama untuk memulai program
 */
public class Main {
    public static void main(String[] args) {

        // Membuat objek Herbivore dan Carnivore
        Herbivore deer = new Herbivore("Rusa", "Cervidae");
        Carnivore tiger = new Carnivore("Harimau", "Panthera Tigris");

        System.out.println("Zoo Management System - OOP");
        System.out.println("===========================");

        // Menampilkan object Herbivore dan Carnivore
        deer.showTrophicCategory();
        tiger.showTrophicCategory();
    }
}
