/**
 * Class parent Animal untuk class Carnivore dan Herbivore
 */
public abstract class Animal {
    // Private attribute name (encapsulation)
    private String name;
    
    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Getter untuk name (encapsulation)
    public String getName() {
        return name;
    }
    
    // Setter untuk name (encapsulation)
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method untuk child class Carnivore & Herbivore (polymorphism)
    public abstract void showTrophicCategory();
}
