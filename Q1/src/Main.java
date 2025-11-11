import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       boolean running = true;

       while (running) {
           System.out.println("\n=== Notenrechner Menü ===");
           System.out.println("1 - Neue Note berechnen");
           System.out.println("2 - Gesamte Note berechnen");
           System.out.println("3 - Alle Noten anzeigen");
           System.out.println("4 - Exit");
           System.out.print("Auswahl: ");

           int choice = scanner.nextInt();
           switch (choice) {
               case 1:
                   Grade.punkteBerechnung();
                   break;

               case 2:

                   break;

               case 3:
                   break;

               case 4:
                   System.out.println("Programm wird beendet...");
                   running = false;
                   break;

               default:
                   System.out.println("Ungültige Auswahl! Bitte 1, 2, 3 oder 4 eingeben.");
           }
       }

        scanner.close();
       }

    }