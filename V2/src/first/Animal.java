package first;

public class Animal {
    public String name;
    protected int age;
    public String type;
    public String breed;

    public Animal(String name, int age, String type, String breed) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Sound");
    }

    public void showInfo() {
        System.out.print("Name: " + name + ", Age: " + age + ", Type: " + type +  ", Breed: " + breed);
    }

    public void performActivity(){
        System.out.println("No activity");
    }

}