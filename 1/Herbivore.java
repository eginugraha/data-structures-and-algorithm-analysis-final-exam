/**
 * Class Herbivore - Child class untuk class Animal (inheritance)
 */
public class Herbivore extends Animal {
    // Private attribute untuk class herbivore (encapsulation)
    private String scientificName;
    
    // Constructor
    public Herbivore(String name, String scientificName) {
        super(name); // Memanggil constructor parent name
        this.scientificName = scientificName;
    }

    // Getter untuk scientificName (encapsulation)
    public String getScientificName() {
        return scientificName;
    }

    // Setter untuk scientificName (encapsulation)
    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }
    
    // Method untuk abstract method super class Animal (polymorphism)
    @Override
    public void showTrophicCategory() {
        System.out.println(getName() + " (" + scientificName + ") makan tumbuhan.");
    }
}
