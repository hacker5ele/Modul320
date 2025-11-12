package Garage;

public class Vehicle {
    private String name;
    private double costs;
    private boolean repaired;

    public Vehicle(String name, double costs) {
        this.name = name;
        this.costs = costs;
        this.repaired = false;
    }

    public String getName() {
        return name;
    }

    public double getCosts() {
        return costs;
    }

    public boolean isRepaired() {
        return repaired;
    }

    public void repair() {
        repaired = true;
        System.out.println("Repaired: " + repaired);
    }

    @Override
    public String toString() {
        return name + ", " + costs + ", " + (repaired ? "Repaired" : "Not Repaired");
    }
}
