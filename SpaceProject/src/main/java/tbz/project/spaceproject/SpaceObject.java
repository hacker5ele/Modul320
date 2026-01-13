package tbz.project.spaceproject;

public abstract class SpaceObject {
    protected String id;
    protected String name;

    public SpaceObject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract String getInfo(); // Polymorphismus
}
