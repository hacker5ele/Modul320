package tbz.project.spaceproject;

public class Planet extends SpaceObject implements Explorable {

    private double gravity;
    private String discoveredBy;
    private String discoveryDate;
    private double temperature;
    private double mass;
    private double vol;


    public Planet(String id, String name, double gravity, String discoveredBy, String discoveryDate, double temperature, double mass, double vol) {
        super(id, name);
        this.gravity = gravity;
        this.discoveredBy = discoveredBy;
        this.discoveryDate = discoveryDate;
        this.temperature = temperature;
        this.gravity = gravity;
        this.mass = mass;
        this.vol = vol;
    }

    @Override
    public String getInfo() {
        return "Planet " + name +
               "\nID: " + id +
               "\nGravity: " + gravity + " m/s²" +
               "\nDiscovered By: " + discoveredBy +
               "\nDiscovery Date: " + discoveryDate +
               "\nAverage Temperature: " + temperature + " K" +
               "\nMass: " + mass + " kg" +
               "\nVolume: " + vol + " km³";
    }


    @Override
    public String explore() {
        return "Exploring planet " + name;
    }
}

