package second;

import first.*;

import java.util.ArrayList;

/**
 * Manages a collection of pets and provides methods
 * to add, remove, filter, and display them.
 */
public class Pets {

    private ArrayList<Animal> pets;

    /**
     * Creates a new empty pet manager.
     */
    public Pets() {
        pets = new ArrayList<>();
    }

    /**
     * Adds a new pet to the list.
     *
     * @param pet The pet to add.
     */
    public void addPet(Animal pet){
        pets.add(pet);
    }

    /**
     * Removes all pets that match a given name.
     *
     * @param name The name of the pet(s) to remove.
     */
    public void removePet(String name) {
        boolean removed = false;

        removed = pets.removeIf(a -> a.name.equalsIgnoreCase(name));

        if (removed) {
            System.out.println("All pets named \"" + name + "\" were removed.");
        } else {
            System.out.println("No pet named \"" + name + "\" found.");
        }
    }

    /**
     * Displays all pets and makes them show their info + sound.
     */
    public void showAllPets(){
        for (Animal a : pets){
            a.showInfo();
            System.out.println();
            a.makeSound();
            System.out.println();
        }
    }

    /**
     * Displays the activity/behavior of every pet.
     */
    public void showBehaviour(){
        for (Animal a : pets){
            a.performActivity();
        }
    }

    /**
     * Shows pets whose type or breed matches the given string.
     *
     * @param type The type or breed to filter by.
     */
    public void showPetsByType(String type) {
        boolean found = false;

        for (Animal a : pets) {

            // Match by type
            if (a.type.equalsIgnoreCase(type)) {
                a.showInfo();
                System.out.println();
                found = true;
            }

            // Match by breed
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
