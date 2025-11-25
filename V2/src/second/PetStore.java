package second;

import first.*;

public class PetStore {
    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", 4, "Dog","Labrador");
        Cat cat = new Cat("Mittens", 3, "Cat", "Siamese", true);
        Fish fish = new Fish("Goldie", 1, "Fish", "Goldfish");
        Bird bird = new Bird("Polly", 2, "Bird","Parrot", true, true);

        Pets pets = new Pets();

        pets.addPet(dog);
        pets.addPet(cat);
        pets.addPet(bird);
        pets.addPet(fish);

        pets.showAllPets();

    }
}
