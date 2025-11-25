package first;

public class Dog extends Animal {

    public Dog(String name, int age, String type) {
        super(name, age, type);
    }


    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void performActivity() {
        System.out.println(name + " is fetching a ball.");
    }
}