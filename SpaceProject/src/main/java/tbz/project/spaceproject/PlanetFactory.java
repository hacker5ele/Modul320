package tbz.project.spaceproject;

import java.util.Map;

public class PlanetFactory {
    public static Planet createFromApi(Map<String, Object> data) {
        return new Planet(
                (String) data.get("id"),
                (String) data.get("englishName"),
                ((Number) data.get("gravity")).doubleValue()
        );
    }
}
