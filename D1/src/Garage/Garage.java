package Garage;
import java.util.*;

public class Garage {
    private ArrayList<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<Vehicle>();
    }

    public void addVehicle(String name, double costs){
        Vehicle v = new Vehicle(name, costs);
        vehicles.add(v);
        System.out.println("Vehicle was registered");
    }

    public void repairVehicle(String name) {
        for (Vehicle v : vehicles) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.repair();
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }

    public void showAllVehicles() {
        System.out.println("\n--- All vehicles ---");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
