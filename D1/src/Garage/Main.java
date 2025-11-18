package Garage;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Garage garage = new Garage();
        boolean running = true;

        while (running) {

            System.out.println("\n=== Garage-Menu ===");
            System.out.println("1 - Register Vehicle");
            System.out.println("2 - Repair Vehicle");
            System.out.println("3 - Show all Vehicles");
            System.out.println("4 - Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:{
                    System.out.print("Vehicle Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Repair Costs: ");
                    double costs = scanner.nextDouble();
                    scanner.nextLine();
                    garage.addVehicle(name, costs);
                }
                break;
                case 2:{
                    System.out.print("Name of the repaired vehicle: ");
                    String name = scanner.nextLine();
                    garage.repairVehicle(name);
                }
                break;
                case 3:{
                    garage.showAllVehicles();
                }
                break;
                case 4:{
                    System.out.println("Closing garage...");
                    running = false;
                }
                break;
                default: System.out.println("Not a valid option!");
            }
        }
      scanner.close();
    }
}