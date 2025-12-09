package first;

/**
 * Dog
 * Provides specific behavior for dogs, like barking and performing activities.
 */
public class Dog extends Animal {

    /**
     * Creates a new Dog object.
     *
     * @param name  The dog's name.
     * @param age   The dog's age.
     * @param type  The type of animal (should be "Dog").
     * @param breed The dog's breed.
     */
    public Dog(String name, int age, String type, String breed) {
        super(name, age, type, breed);
    }

    /**
     * Prints the sound a dog makes.
     */
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    /**
     * Performs a dog specific activity.
     * In this case, the dog fetches a ball.
     */
    @Override
    public void performActivity() {
        System.out.println(name + " is fetching a ball.");
    }
}
