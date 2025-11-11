import java.util.*;

public class Subject {
    private final Map<String, List<Double>> subjectGrades = new HashMap<>();

    public void addSubject(String subject) {
        subjectGrades.putIfAbsent(subject, new ArrayList<>());
    }

    public void addGrade(String subject, double grade) {
        subjectGrades.get(subject).add(grade);
    }

    private double calculateAverage(String subject) {
        List<Double> grades = subjectGrades.get(subject);
        if (grades == null || grades.isEmpty()) return 0;

        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.size();
    }

    public void showGrades(String subject) {
        if (!subjectGrades.containsKey(subject)) {
            System.out.println("Kein solches Fach existiert: " + subject);
            return;
        }

        List<Double> grades = subjectGrades.get(subject);
        System.out.printf("Fach: %s%n", subject);

        if (grades.isEmpty()) {
            System.out.println("Keine Noten gefunden");
        } else {
            System.out.print("Noten: ");
            for (double g : grades) System.out.printf("%.2f ", g);
            System.out.println();
            System.out.printf("Durchschnittsnote beträgt: %.2f%n", calculateAverage(subject));
        }
    }

    public void showAllSubjects() {
        if(subjectGrades.isEmpty()) {
            System.out.println("Keine Noten gefunden");
            return;
        }
        for (String subject : subjectGrades.keySet()) {
            showGrades(subject);
            System.out.println();
        }
    }
}
