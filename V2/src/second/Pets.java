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

    public void removePet(String name){
        Animal toRemove = null;
        for(Animal a : pets){
            if(a.name.equalsIgnoreCase(name)){
                toRemove = a;
                break;
            }
        }
        if(toRemove != null){
            pets.remove(toRemove);
            System.out.println(name + " was removed.");
        } else {
            System.out.println(name + " does not exist.");
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
