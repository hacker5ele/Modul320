package first;

class Dog extends Animal {

    public Dog(String name, int age, String type) {
        super(name, age, type);
    }


    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println(name + " is fetching a ball.");
    }
}