package tbz.project.spaceproject.DTO;

import lombok.Getter;

@Getter
public class PlanetApiDTO {

    private String id;
    private String englishName;
    private Double gravity;
    private Double avgTemp;
    private MassDTO mass;
    private VolumeDTO vol;
    private String discoveryDate;
    private String discoveredBy;

}

