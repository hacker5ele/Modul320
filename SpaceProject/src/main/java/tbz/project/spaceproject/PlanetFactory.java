package tbz.project.spaceproject;

import java.util.Map;

public class PlanetFactory {
    public static Planet createFromApi(Map<String, Object> data) {

        // Gravity
        double gravity = 0.0;
        if (data.get("gravity") != null) {
            gravity = ((Number) data.get("gravity")).doubleValue();
        }

        // Temperature
        double temperature = 0.0;
        if (data.get("avgTemp") != null) {
            temperature = ((Number) data.get("avgTemp")).doubleValue();
        }

        // Mass
        double mass = 0.0;
        Map<String, Object> massMap = (Map<String, Object>) data.get("mass");
        if (massMap != null) {
            Number massValue = (Number) massMap.get("massValue");
            Number massExponent = (Number) massMap.get("massExponent");
            if (massValue != null && massExponent != null) {
                mass = massValue.doubleValue() * Math.pow(10, massExponent.doubleValue());
            }
        }

        // Volume
        double vol = 0.0;
        Map<String, Object> volMap = (Map<String, Object>) data.get("vol");
        if (volMap != null) {
            Number volValue = (Number) volMap.get("volValue");
            Number volExponent = (Number) volMap.get("volExponent");
            if (volValue != null && volExponent != null) {
                vol = volValue.doubleValue() * Math.pow(10, volExponent.doubleValue());
            }
        }

        return new Planet(
                (String) data.get("id"),
                (String) data.get("englishName"),
                gravity,
                (String) data.get("discoveredBy"),
                (String) data.get("discoveryDate"),
                temperature,
                mass,
                vol
        );
    }
}
