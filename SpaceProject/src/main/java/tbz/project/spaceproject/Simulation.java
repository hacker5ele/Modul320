package tbz.project.spaceproject;

public class Simulation {

    public void runSimulation(int type) {

        String destination = "";
        String aircraft = "";

        System.out.println("Welcome to SpaceXplorer\n");

        System.out.println("Please choose ur Destination:");
        System.out.println("1. Mars");
        System.out.println("2. Venus");
        System.out.println("3. Mercury");
        System.out.println("4. Moon");
        System.out.println("5. Jupiter");
        System.out.println("6. Saturn");
        System.out.println("7. Uranus");
        System.out.println("8. Neptune\n");

        switch (type) {
            case 1:
                destination = "Mars";
                aircraft = "350";
                break;
            case 2:
                destination = "Venus";
                aircraft = "420";
                break;
            case 3:
                destination = "Mercury";
                aircraft = "210";
                break;
            case 4:
                destination = "Moon";
                aircraft = "101";
                break;
            case 5:
                destination = "Jupiter";
                aircraft = "777";
                break;
            case 6:
                destination = "Saturn";
                aircraft = "880";
                break;
            case 7:
                destination = "Uranus";
                aircraft = "666";
                break;
            case 8:
                destination = "Neptune";
                aircraft = "909";
                break;
            default:
                System.out.println("Unknown destination ❓");
                return;
        }

        // Boarding
        System.out.println("For this Destination pls board Aircraft " + aircraft);
        System.out.println("\nBoarding...\n");

        System.out.println("You have boarded Aircraft " + aircraft +
                ", buckle ur seatbelt and were starting for take off.\n");

        countdown();

        System.out.println("Blast Off, wish u a wonderful trip!\n");

        // Arrival
        System.out.println("We are arriving to ur destination.");
        System.out.println("Here's some Information regarding this Planet:\n");
        System.out.println("uihviuehdfuicwhdichdocjdsic\n");

        // Return trip
        System.out.println("Write yes when ur ready to head back.\n");
        System.out.println("We r heading back, say goodbye to " + destination + "\n");

        System.out.println("We've almost reached Planet Earth, in\n");
        countdown();

        System.out.println("We're back on Earth dear fellow explorer, we hope u enjoyed and till next time.\n");
        System.out.println("Would you like to play again? (y/n)\n");
        System.out.println("Adios Amigo 👋");
    }

    private void countdown() {
        System.out.println("5..");
        System.out.println("4..");
        System.out.println("3..");
        System.out.println("2..");
        System.out.println("1..\n");
    }
}
