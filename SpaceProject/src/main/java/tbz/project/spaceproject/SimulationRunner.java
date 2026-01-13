package tbz.project.spaceproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tbz.project.spaceproject.rest.PlanetAPIService;

@Component
public class SimulationRunner implements CommandLineRunner {

    private final PlanetAPIService planetAPIService;

    public SimulationRunner(PlanetAPIService planetAPIService) {
        this.planetAPIService = planetAPIService;
    }

    @Override
    public void run(String... args) throws Exception {
        Simulation sim = new Simulation(planetAPIService);
        sim.runSimulation(1); // 1 = Mars
    }
}

