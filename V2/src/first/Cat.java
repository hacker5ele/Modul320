package first;

public class Cat extends Animal {

    private boolean indoor;

    public Cat(String name, int age, String type, boolean indoor) {
        super(name, age, type);
        this.indoor = indoor;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Indoor: " + indoor);
    }

    public void scratch() {
        System.out.println(name + " is scratching the post.");
    }
}
