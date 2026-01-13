package tbz.project.spaceproject.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tbz.project.spaceproject.Planet;

import java.util.Map;

@Service
public class PlanetAPIService {

    @Value("${solar.api.base-url}")
    private String baseUrl;

    @Value("${solar.api.key}")
    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public Planet getPlanet(String planetId) {

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(apiKey);

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<Map> response = restTemplate.exchange(
                baseUrl + "/bodies/" + planetId,
                HttpMethod.GET,
                entity,
                Map.class
        );

        Map<String, Object> body = response.getBody();

        return new Planet(
                (String) body.get("id"),
                (String) body.get("englishName"),
                body.get("gravity") != null
                        ? ((Number) body.get("gravity")).doubleValue()
                        : 0.0
        );
    }
}

