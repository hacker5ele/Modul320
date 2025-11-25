package first;

public class Animal {
    public String name;
    protected int age;
    public String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void makeSound() {
        System.out.println("Sound");
    }

    public void showInfo() {
        System.out.print("Name: " + name + ", Age: " + age + ", Type: " + type);
    }

    public void performActivity(){
        System.out.println("No activity");
    }

}