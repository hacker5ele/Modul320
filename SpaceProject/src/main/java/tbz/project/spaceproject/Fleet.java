package tbz.project.spaceproject;

import java.util.ArrayList;
import java.util.List;

public class Fleet<T extends Explorable> {

    private List<T> explorers = new ArrayList<>();

    public void add(T explorer) {
        explorers.add(explorer);
    }

    public List<String> exploreAll() {
        return explorers.stream()
                .map(Explorable::explore)
                .toList();
    }
}

