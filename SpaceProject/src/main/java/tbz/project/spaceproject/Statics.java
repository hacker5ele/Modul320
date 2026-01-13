package tbz.project.spaceproject;

public class Statics {
    private static int exploredPlanets = 0;

    public static void planetExplored() {
        exploredPlanets++;
    }

    public static int getExploredPlanets() {
        return exploredPlanets;
    }
}
