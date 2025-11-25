package first;

public class Cat extends Animal {

    private boolean indoor;

    public Cat(String name, int age, String type, String breed, boolean indoor) {
        super(name, age, type, breed);
        this.indoor = indoor;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print(", Indoor: " + indoor);
    }

    @Override
    public void performActivity() {
        System.out.println(name + " is scratching the post.");
    }
}
