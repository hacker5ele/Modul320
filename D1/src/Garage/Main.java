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
        }

    }
}