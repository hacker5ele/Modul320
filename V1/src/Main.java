import first.Cat;
import first.Dog;
import second.CatList;
import second.Cats;

import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Monia", 3);
        Dog dog = new Dog("Charlie", 5);

        System.out.println("Task 1: ");
        System.out.println("Cat 1: ");
        cat1.makeSound();
        System.out.println("Dog: ");
        dog.makeSound();

        System.out.println("----------------------------------------------------------");

        CatList catList = new CatList();
        catList.add(new Cats("Lily", 4));
        catList.add(new Cats("Dog", 5));
        catList.add(new Cats("Monia", 3));

        System.out.println("Task 2: ");
        System.out.println("All cats before sorting: ");

        catList.printAll();

        Collections.sort(catList);

        System.out.println("All cats after sorting: ");
        catList.printAll();

    }
}