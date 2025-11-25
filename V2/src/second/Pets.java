package second;

import first.*;

import java.util.ArrayList;

public class Pets {

    private ArrayList<Animal> pets;

    public Pets() {
        pets = new ArrayList<>();
    }

    public void addPet(Animal pet){
        pets.add(pet);
    }

    public void removePet(String name) {
        boolean removed = false;

        removed = pets.removeIf(a -> a.name.equalsIgnoreCase(name));

        if (removed) {
            System.out.println("All pets named \"" + name + "\" were removed.");
        } else {
            System.out.println("No pet named \"" + name + "\" found.");
        }
    }

    public void showAllPets(){
        for (Animal a : pets){
            a.showInfo();
            System.out.println();
            a.makeSound();
            System.out.println();
        }
    }

    public void showBehaviour(){
        for (Animal a : pets){
            a.performActivity();
        }
    }

    public void showPetsByType(String type) {
        boolean found = false;

        for (Animal a : pets) {
            if (a.type.equalsIgnoreCase(type)) {
                a.showInfo();
                System.out.println();
                found = true;
            }
                if (a.breed.equalsIgnoreCase(type)) {
                    a.showInfo();
                    System.out.println();
                    found = true;
                }
            }
        if (!found) {
            System.out.println("Pet named \"" + type + "\" not found.");
        }
    }
}
