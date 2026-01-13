package tbz.project.spaceproject;

public class Planet extends SpaceObject implements Explorable {

    private double gravity;

    public Planet(String id, String name, double gravity) {
        super(id, name);
        this.gravity = gravity;
    }

    @Override
    public String getInfo() {
        return "Planet " + name + " with gravity " + gravity;
    }

    @Override
    public String explore() {
        return "Exploring planet " + name;
    }
}

