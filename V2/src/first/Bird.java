package first;

/**
 * Bird
 * Includes bird specific attributes such as flying and talking abilities.
 */
public class Bird extends Animal {

    /**
     * True if the bird can fly.
     */
    private boolean canFly;

    /**
     * True if the bird can talk.
     */
    private boolean canTalk;

    /**
     * Creates a new Bird object.
     *
     * @param name  The bird's name.
     * @param age   The bird's age.
     * @param type  The type of animal (should be "Bird").
     * @param breed The bird's breed.
     * @param fly   True if the bird can fly.
     * @param talk  True if the bird can talk.
     */
    public Bird(String name, int age, String type, String breed, boolean fly, boolean talk) {
        super(name, age, type, breed);
        this.canFly = fly;
        this.canTalk = talk;
    }

    /**
     * Prints the sound the bird makes.
     * If the bird can talk, it says "Hii!", otherwise it tweets.
     */
    @Override
    public void makeSound() {
        if (canTalk) {
            System.out.println("Hii!");
        } else {
            System.out.println("Tweet");
        }
    }

    /**
     * Displays information about the bird, including flying and talking abilities.
     */
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(", Can Fly: " + canFly + ", Can Talk: " + canTalk);
    }

    /**
     * Performs a bird-specific activity.
     * Shows flying and/or talking behavior depending on its abilities.
     */
    @Override
    public void performActivity() {
        String action = name + " is ";
        action += canFly ? "flying" : "sitting";
        action += canTalk ? " and talking" : "";
        System.out.println(action);
    }
}
