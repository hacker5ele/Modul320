package first;

/**
 * Cat
 * Includes cat specific attributes and behaviors, like whether it's an indoor cat.
 */
public class Cat extends Animal {

    /**
     * Indicates whether the cat is an indoor cat.
     */
    private boolean indoor;

    /**
     * Creates a new Cat object.
     *
     * @param name   The cat's name.
     * @param age    The cat's age.
     * @param type   The type of animal (should be "Cat").
     * @param breed  The cat's breed.
     * @param indoor True if the cat is an indoor cat, false otherwise.
     */
    public Cat(String name, int age, String type, String breed, boolean indoor) {
        super(name, age, type, breed);
        this.indoor = indoor;
    }

    /**
     * Prints the sound a cat makes.
     */
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    /**
     * Displays information about the cat, including whether it is indoor.
     */
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(", Indoor: " + indoor);
    }

    /**
     * Performs a cat-specific activity.
     * In this case, the cat scratches the post.
     */
    @Override
    public void performActivity() {
        System.out.println(name + " is scratching the post.");
    }

}
