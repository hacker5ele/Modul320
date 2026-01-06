import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Portfolio p = new Portfolio();

        boolean valid = true;
        Stockexchange exchange = null;

        while (valid) {
            System.out.println("Welche Börse?");
            System.out.println("1. New York");
            System.out.println("2. London");
            System.out.println("3. Zuerich");
            System.out.println("4. Programm Beenden");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    exchange = new Ny();
                    break;

                case 2:
                    exchange = new London();
                    break;

                case 3:
                    exchange = new Zuerich();
                    break;

                case 4:
                    System.out.println("Programm beendet...");
                    valid = false;
                    sc.close();
                    return;

                default:
                    System.out.println("Falsche Eingabe");
            }
            p.printValues(exchange);

        }
    }
}
