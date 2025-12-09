package first;

/**
 * Animal
 * Provides common attributes and methods that all animals share.
 * This class is intended to be extended by specific animal types.
 */
public class Animal {

    /**
     * The animal's name.
     */
    public String name;

    /**
     * The animal's age.
     * Protected so subclasses can access it directly.
     */
    protected int age;

    /**
     * The type of the animal (e.g., Dog, Cat, Bird, Fish).
     */
    public String type;

    /**
     * The breed of the animal.
     */
    public String breed;

    /**
     * Creates a new Animal object.
     *
     * @param name  The animal's name.
     * @param age   The animal's age.
     * @param type  The type of animal.
     * @param breed The animal's breed.
     */
    public Animal(String name, int age, String type, String breed) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.breed = breed;
    }

    /**
     * Prints a sound for the animal.
     * Subclasses should override this method to provide species specific sounds.
     */
    public void makeSound() {
        System.out.println("Sound");
    }

    /**
     * Displays information about the animal, including name, age, type, and breed.
     */
    public void showInfo() {
        System.out.print("Name: " + name + ", Age: " + age + ", Type: " + type + ", Breed: " + breed);
    }

    /**
     * Performs a default activity for the animal.
     * Subclasses should override this method to provide specific behaviors.
     */
    public void performActivity() {
        System.out.println("No activity");
    }
}
