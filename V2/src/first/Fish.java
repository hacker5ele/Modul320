package first;

public class Fish extends Animal {

    private String waterType;

    public Fish(String name, int age, String type, String breed) {
        super(name, age, type, breed);
    }

    @Override
    public void makeSound() {
        System.out.println("Blub");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(", Water Type: " + waterType);
    }

}
