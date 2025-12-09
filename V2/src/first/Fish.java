package first;

/**
 * Fish
 * Stores specific information about a fish including its water type.
 */
public class Fish extends Animal {

    /**
     * The type of water the fish lives in (e.g., freshwater or saltwater).
     */
    private String waterType;

    /**
     * Creates a new Fish object.
     *
     * @param name  The fish's name.
     * @param age   The fish's age.
     * @param type  The general type (will be "Fish").
     * @param breed The fish's breed.
     */
    public Fish(String name, int age, String type, String breed) {
        super(name, age, type, breed);
    }

    /**
     * Prints the sound a fish makes.
     */
    @Override
    public void makeSound() {
        System.out.println("Blub");
    }

    /**
     * Displays all information about the fish, including water type.
     */
    @Override
    public void showInfo() {
        super.showInfo(); // Show common Animal info (name, age, type, breed)
        System.out.print(", Water Type: " + waterType);
    }
}
