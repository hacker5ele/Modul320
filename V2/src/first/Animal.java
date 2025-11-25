package first;

public class Animal {
    protected String name;
    private int age;
    private String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void makeSound() {
        System.out.println("Sound");
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Type: " + type);
    }

}