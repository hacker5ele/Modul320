import java.util.Scanner;

public class Grade {

    public static void punkteBerechnung(Subject manager) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fach: ");
        String fach = scanner.nextLine();

        manager.addSubject(fach);

        System.out.print("Gesamtpunkte: ");
        double gesamt = scanner.nextDouble();

        System.out.print("Erreichte Punkte: ");
        double erreicht = scanner.nextDouble();

        double note = (erreicht / gesamt) * 5 + 1;

        manager.addGrade(fach, note);

        System.out.printf("Die berechnete Note beträgt: %.2f%n", note);
        System.out.printf("Diese wird in diesem Fach abgespeichert: %s%n", fach);
    }
}