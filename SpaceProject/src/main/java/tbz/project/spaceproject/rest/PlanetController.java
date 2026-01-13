package tbz.project.spaceproject.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tbz.project.spaceproject.Planet;

@RestController
@RequestMapping("/api/planets")
public class PlanetController {

    private final PlanetAPIService planetApiService;

    public PlanetController(PlanetAPIService planetApiService) {
        this.planetApiService = planetApiService;
    }

    @GetMapping("/{id}")
    public Planet getPlanet(@PathVariable String id) {
        return planetApiService.getPlanet(id);
    }
}

