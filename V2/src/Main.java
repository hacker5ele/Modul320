import java.util.Scanner;
import second.*;
import first.*;

public class Main {
    public static void main(String[] args) {

        Pets pets = new Pets();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while(running) {

        System.out.println("\n=== Pet Store ===");
            System.out.println("1. Add Pet");
            System.out.println("2. Show All Pets");
            System.out.println("3. Show All Behaviors");
            System.out.println("4. Show Pets by Breed/Type");
            System.out.println("5. Remove Pet by Name");
            System.out.println("6. Exit");
            System.out.println("Choose an Option: ");

            int option = sc.nextInt();
            sc.nextLine();
            switch(option) {
                case 1:
                    System.out.println("What type of pet would you like to add?");
                    System.out.println("1. Dog");
                    System.out.println("2. Cat");
                    System.out.println("3. Bird");
                    System.out.println("4. Fish");
                    int petType = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // consume newline

                    switch (petType) {
                        case 1: // Dog
                            System.out.print("Enter dog breed: ");
                            String dogType = sc.nextLine();
                            Dog dog = new Dog(name, age, "Dog", dogType);
                            pets.addPet(dog);
                            break;

                        case 2: // Cat
                            System.out.print("Enter cat Breed: ");
                            String catType = sc.nextLine();
                            System.out.print("Is the cat indoor? (true/false): ");
                            boolean indoor = sc.nextBoolean();
                            sc.nextLine();
                            Cat cat = new Cat(name, age, "Cat", catType, indoor);
                            pets.addPet(cat);
                            break;

                        case 3: // Bird
                            System.out.print("Enter bird breed: ");
                            String birdType = sc.nextLine();
                            System.out.print("Can the bird fly? (true/false): ");
                            boolean canFly = sc.nextBoolean();
                            System.out.print("Can the bird talk? (true/false): ");
                            boolean canTalk = sc.nextBoolean();
                            sc.nextLine();
                            Bird bird = new Bird(name, age, "Bird", birdType, canFly, canTalk);
                            pets.addPet(bird);
                            break;

                        case 4: // Fish
                            System.out.print("Enter fish breed: ");
                            String fishType = sc.nextLine();
                            Fish fish = new Fish(name, age, "Fish", fishType);
                            pets.addPet(fish);
                            break;

                        default:
                            System.out.println("Invalid pet type!");
                    }
                    break;
                case 2:
                    pets.showAllPets();
                    break;

                case 3:
                    pets.showBehaviour();
                    break;

                case 4:
                    String type = sc.nextLine();
                    pets.showPetsByType(type);
                    break;

                case 5:
                    System.out.print("Enter pet name to remove: ");
                    String removeName = sc.nextLine();
                    pets.removePet(removeName);
                    break;

                case 6:
                    running = false;
                    System.out.println("Exiting Pet Store...");
                    break;
                default:
                    System.out.println("Invalid Option");

            }
        }
        sc.close();

    }
}